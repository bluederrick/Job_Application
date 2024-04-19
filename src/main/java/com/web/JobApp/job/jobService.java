package com.web.JobApp.job;

import java.util.List;

//  we would have the methds defined here
public interface jobService {

       List<job> findAll(); 
    void  createAjob(job Job);
    boolean deleteJobById(Long id); 
 static job getJobById(Long id) ;
  boolean updateJob(Long id, job update );

}
         






   
}
