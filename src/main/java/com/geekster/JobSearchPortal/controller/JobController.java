package com.geekster.JobSearchPortal.controller;

import com.geekster.JobSearchPortal.model.Job;
import com.geekster.JobSearchPortal.model.Type;
import com.geekster.JobSearchPortal.service.JobService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated // if we are taking like list input then it's use compulsory otherwise @Valid did not works
public class JobController {
    @Autowired
    JobService jobService;

    @GetMapping("jobs")
    public Iterable<Job> getAllJobs() {  // Iterable is the parent bcz findAll() return the Iterable so, we use return type Iterable
        return jobService.getAllJobs();
    }


    @PostMapping("jobs/addJobs")
    public String addJobsList(@RequestBody @Valid List<Job> job) { // We are using Validation on the client side inputs
        return jobService.addJobsList(job);
    }


    @PostMapping("jobs/add")
    public String addJob(@Valid @RequestBody Job job) {
        return jobService.addJob(job);
    }

//    Task-A--4  --> using count()
//    count the total numbers of jobs // GET/READ
    @GetMapping("jobs/count")
    public String getCountJobs() {
        return jobService.getCountJobs();
    }


//    Task -- B --> Custom Finder Operation --> 4 Example of Custom finder are given below
//    Task--B--1 --> All jobs list for jobType // filter out on job type
    @GetMapping("jobs/jobType/{type}")
    public List<Job> getAllJobsByJobType(@PathVariable Type type) {
        return jobService.getAllJobsByJobType(type);
    }
//    Task--B--2 --> All Jobs List for Salary greater than or equal and type is match
    @GetMapping("jobs/type/{type}/salary")
    public List<Job> getAllJobsByGreaterOrEqualSalaryAndJobType(@RequestParam Double jobSalary, @PathVariable Type type) {
        return jobService.getAllJobsByGreaterOrEqualSalaryAndJobType(jobSalary, type);
    }
    @GetMapping("jobs/companyName/{companyName}/type")
    public List<Job> getAllJobsByCompanyNameAndTypeEqual(@PathVariable String companyName, @RequestParam Type type) {
        return jobService.getAllJobsByCompanyNameAndTypeEqual(companyName, type);
    }
//    Task--B--4 --> All jobs for Location and order by salary
    @GetMapping("jobs/location/{location}")
    public List<Job> getAllJobsByLocationAndSortedSalaryDesc(@PathVariable String location) {
        return jobService.getAllJobsByLocationAndSortedSalaryDesc(location);
    }


    @GetMapping("jobs/jobId/{id}")
    public Job getJobsById(@PathVariable Long id) {
        return jobService.getJobsById(id);
    }

    @GetMapping("jobs/location/{location}/jobList")
    public List<Job> getAllJobsByLocation(@PathVariable String location) {
        return jobService.getAllJobsByLocation(location);
    }

}
