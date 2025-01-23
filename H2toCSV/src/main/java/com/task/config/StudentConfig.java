package com.task.config;

import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.task.entity.Student;

@Configuration
@EnableBatchProcessing
public class StudentConfig {
	public class BatchConfiguration {

	    @Autowired
	    private JobBuilderFactory jobBuilderFactory;

	    @Autowired
	    private StepBuilderFactory stepBuilderFactory;

	    @Autowired
	    private DataSource dataSource;

	    @Bean
	    public JdbcCursorItemReader<Student> reader() {
	        JdbcCursorItemReader<Student> reader = new JdbcCursorItemReader<>();
	        reader.setDataSource(dataSource);
	        reader.setSql("SELECT id, firstname, age, city FROM student");
	        reader.setRowMapper((ResultSet rs, int rowNum) -> {
	            Student student = new Student();
	            student.setId(rs.getInt("id"));
	            student.setFirstName(rs.getString("firstname"));
	            student.setAge(rs.getInt("age"));
	            student.setCity(rs.getString("city"));
	            return student;
	        });
	        return reader;
	    }

	    @Bean
	    public FlatFileItemWriter<Student> writer() {
	        FlatFileItemWriter<Student> writer = new FlatFileItemWriter<>();
	        writer.setResource(new FileSystemResource("pg.csv"));
	        writer.setLineAggregator(new DelimitedLineAggregator<Student>() {{
	            setDelimiter(",");
	            setFieldExtractor(student -> new Object[]{student.getId(), student.getFirstName(), student.getAge(), student.getCity()});
	        }});
	        return writer;
	    }

	    @Bean
	    public Step exportStep() {
	        return stepBuilderFactory.get("exportStep")
	                .<Student, Student>chunk(10)
	                .reader(reader())
	                .writer(writer())
	                .build();
	    }

	    @Bean
	    public Job exportJob() {
	        return jobBuilderFactory.get("exportJob")
	                .incrementer(new RunIdIncrementer())
	                .flow(exportStep())
	                .end()
	                .build();
	    }
	}
}
