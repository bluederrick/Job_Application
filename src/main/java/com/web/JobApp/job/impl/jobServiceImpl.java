package com.web.JobApp.job.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.web.JobApp.job.job;
import com.web.JobApp.job.jobService;


@Service
public class jobServiceImpl implements jobService{
// implementation class 
      private List<job> jobs = new ArrayList<>();
      private long nextId  =1L;

      @Override
      public List<job> findAll() {

            return jobs;

      }

      @Override
      public void createAjob(job Job) {
            Job.setId(nextId++);
            jobs.add(Job);

      }

     @Override
      public job getJobById (Long id){
            // we need to fetch the job with partcalur Id above
      //      jobs us the List  , job is the type or schema

      // List <> jobs; so a will loop through jobs
      // a iterate through the List
      // for(int a; jobs)
           for(job Job: jobs){
            if(Job.getId() .equals(id)){

                  return Job;
            };
           }
            return null;
      

      }
    @Override
    public boolean deleteJobById(Long id){
      // iterator helps to travel through the list of jobs
      Iterator <job> iterator = jobs.iterator();
      while(iterator.hasNext()){
         job Job= iterator.next();
      //    next() fecthing item and assigning it to the job object
         if(Job.getId().equals(id)){
            iterator.remove();
            return true;
      }
      }
      return false; 
    }

@Override
public boolean updateJob(Long id, job udate) {
  for(job Job: jobs){
      if(Job.getId() .equals(id)){
            Job.setTitle(updateJob.getTitle());
            Job.setDescription(updateJob.getDescription());
            Job.setMin_Salary(updateJob.getMin_Salary());
            Job.setMax_Salary(updateJob.getMax_Salary());
            Job.setLocation(updateJob.getLocation());
      }
  }
      return false;
}   

 
}
