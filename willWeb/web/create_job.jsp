<%-- 
    Document   : create_job
    Created on : 14 Jul 2023, 9:32:11 PM
    Author     : glodi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jobs Page</title>
    </head>
    <body>
        
        <h1> Create Jobs </h1>
  <form method="post" action="CreateJobServlet.do">
      <br>
      <label>Faculty Name :</label>
      <input type="text" name="faculty_name">
     
      <br>
      <label>Job 1:</label>
      <input type="text" name="job1">
     
      <br>
      <label>Job 2:</label>
      <input type="text" name="job2">
      
      <br>
      <label>Job 3:</label>
      <input type="text" name="job3">
      
      <br>
      <label>Job 4:</label>
      <input type="text" name="job4">
      
      <br>
    
    <button type="submit"> CREATE JOBS </button>
  </form>
    </body>
</html>
