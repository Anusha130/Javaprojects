package com.taskletdemo.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.taskletdemo.reader.MyItemReader;
import com.taskletdemo.taskelt.MyTasklet;
import com.taskletdemo.writer.MyItemWriter;

@Configuration
@EnableBatchProcessing
public class TaskletConfig {

	@Autowired
	MyTasklet tasklet;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Bean
	public Job job() {
		return jobBuilderFactory.get("job")
				.incrementer(new RunIdIncrementer())
				.start(step1())
				.next(step2())
				.next(step3())
				.build();
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1")
				.<String, String>chunk(1)
				.reader(new MyItemReader())
				.writer(new MyItemWriter())
				.build();
	}

	@Bean
	public Step step2() {
		return stepBuilderFactory.get("step2").tasklet(new MyTasklet()).build();
	}

	@Bean
	public Step step3() {
		return stepBuilderFactory.get("step3").tasklet(new MyTasklet()).build();
	}
}
