package com.springdemo.rest;


import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private JobLauncher joblanucher;
	
	@Autowired
	private Job job;
	
	@GetMapping("/customers")
	public void loadCSVtoObj() throws Exception {
		JobParameters jobparams = new JobParametersBuilder()
				.addLong("Start-At",System.currentTimeMillis()).toJobParameters();
		
		joblanucher.run(job, jobparams);
	}
}
