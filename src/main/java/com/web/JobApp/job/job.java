package com.web.JobApp.job;

public class job {
      private Long id ; 
      private String title;
      private String Description;
      private String min_Salary;
      private String max_Salary;
      private String location;
      
      public job(Long id, String title, String description, String min_Salary, String max_Salary, String location) {
            this.id = id;
            this.title = title;
            Description = description;
            this.min_Salary = min_Salary;
            this.max_Salary = max_Salary;
            this.location = location;
      }

      public Long getId() {
            return id;
      }

      public  void setId(Long id) {
            this.id = id;
      }

      public String getTitle() {
            return title;
      }

      public void setTitle(String title) {
            this.title = title;
      }

      public String getDescription() {
            return Description;
      }

      public void setDescription(String description) {
            Description = description;
      }

      public String getMin_Salary() {
            return min_Salary;
      }

      public void setMin_Salary(String min_Salary) {
            this.min_Salary = min_Salary;
      }

      public String getMax_Salary() {
            return max_Salary;
      }

      public void setMax_Salary(String max_Salary) {
            this.max_Salary = max_Salary;
      }

      public String getLocation() {
            return location;
      }

      public void setLocation(String location) {
            this.location = location;
      }


      
}
