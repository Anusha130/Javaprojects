package com.task.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job exportJob;

    @GetMapping("/export")
    public ResponseEntity<String> exportToCsv() throws JobExecutionException {
        JobParameters jobParameters = new JobParametersBuilder()
            .addString("JobID", String.valueOf(System.currentTimeMillis()))
            .toJobParameters();
        jobLauncher.run(exportJob, jobParameters);
        return ResponseEntity.ok("Export job started.");
    }
}


