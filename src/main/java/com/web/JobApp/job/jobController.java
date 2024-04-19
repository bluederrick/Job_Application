package com.web.JobApp.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

 
@RestController
public class jobController {
      // object

      private jobService JobService;
      
       public jobController(jobService jobService) {
            JobService = jobService;
      }

      // acting as the database
// job is class
      @GetMapping("/jobs")
      public  ResponseEntity<List<job>> findAll(){
            return ResponseEntity.ok(JobService.findAll());
      }

     
      @PostMapping("/jobs")
      public ResponseEntity<String> createJob(@RequestBody job Job){
          JobService.createAjob(Job);;
            return new ResponseEntity<>("job added successfully to database",HttpStatus.OK);
      
      }
    @GetMapping("/jobs/{id}")
//     anytime you see {} mesans it is dynamic
// pathvrable makrs sure that whatever that is passed in urlpath its being assigned is assigned  Long id
      public ResponseEntity<job> getJobById( @PathVariable Long id){

            job job = jobService.getJobById(id);

            return new ResponseEntity<>(job,HttpStatus.OK);
            return new ResponseEntity<>(null , HttpStatus.NOT_FOUND)
      }

      @DeleteMapping("/job/{id}")
      public ResponseEntity<String> deleteJobById(@PathVariable Long id){
            boolean deleted =JobService.deleteJobById(id);
            if(deleted){
                  return  new ResponseEntity<>("job deleted successfully", HttpStatus.OK);
            }
            return new  ResponseEntity<>(HttpStatus.NOT_FOUND);

      }
      // @PutMapping("/job/{id}")
      @RequestMapping(value = "/job/{id}", method = RequestMethod.PUT)
      public ResponseEntity<String> updateJob(@PathVariable Long id ,@RequestBody job updatedJob   ){
            // here we need to pass in the update job information
boolean updated = jobService.updateJob(id , updated);

if( updated)     
return  new ResponseEntity<>("job update successfully",HttpStatus.OK)
      }


      
}

