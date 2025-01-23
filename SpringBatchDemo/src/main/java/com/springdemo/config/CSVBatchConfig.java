package com.springdemo.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.springdemo.entity.Customer;
import com.springdemo.repo.CustomerRepository;

@Configuration
@EnableBatchProcessing
public class CSVBatchConfig {

	
	@Autowired
  private CustomerRepository customerRepo; //used  at the writer place
	
	@Autowired
	private StepBuilderFactory stepBuildFactory; //used build the step object
	
	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;//which is used build job object
	
//item reader it is method is used to read the data
	public FlatFileItemReader<Customer> customerReader(){
		FlatFileItemReader<Customer> itemReader = new FlatFileItemReader<>();
		itemReader.setResource(new FileSystemResource("src/main/resources/batch.csv"));
		itemReader.setName("csvReader");
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(lineMapper());//used tell that read one line and represent that line as one cudtomer object
		// we need insert that as one record
		
		return itemReader;
	}
//when am reading the data linemapper is importanat telling that data lines are delinited by comma(,)
	// this is order convert the data into javaobject
	private LineMapper<Customer> lineMapper() {
		// TODO Auto-generated method stub
		DefaultLineMapper<Customer>linemapper = new DefaultLineMapper<>();
		DelimitedLineTokenizer lineTokenizer= new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(",");
		lineTokenizer.setStrict(false);
		lineTokenizer.setNames("id","firstName","lastName","gender","contactNo","country","village","company");
		BeanWrapperFieldSetMapper<Customer> fieldsetMapper = new BeanWrapperFieldSetMapper<>();
		fieldsetMapper.setTargetType(Customer.class);
		linemapper.setLineTokenizer(lineTokenizer);
		linemapper.setFieldSetMapper(fieldsetMapper);
		
		
		
		return linemapper;
	}
	
	// proceessor creator
	
	public CustomerProcessor customerProcessor() {
		return new CustomerProcessor();
	}
	
	//item writer which will write data into database by using jpa repository awith the help of save method
	@Bean
	public RepositoryItemWriter<Customer> customerWriter(){
		 RepositoryItemWriter<Customer> repositoryWriter = new  RepositoryItemWriter<>();
		 repositoryWriter.setRepository(customerRepo);
		 repositoryWriter.setMethodName("save");//to insert the record
		 
		 return repositoryWriter;
	}
	
	
	// create step

	public Step step1() {
		return stepBuildFactory.get("step 1").<Customer,Customer>chunk(5)
				.reader(customerReader())
				.processor(customerProcessor())
				.writer(customerWriter())
				.build();
		
	}
	
	
	
	
	
	//create job
	
	public Job job() {
		return jobBuilderFactory.get("customer job")
				.flow(step1())
				.end()
				.build();
	}
}
