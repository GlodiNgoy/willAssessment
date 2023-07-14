<%-- 
    Document   : all
    Created on : 14 Jul 2023, 11:07:52 PM
    Author     : glodi
--%>

<%@page import="java.util.List"%>
<%@page import="entities.Job"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Page</title>
    </head>
    <body>
        <%
        List<Job> jobs = (List<Job>) request.getAttribute("jobs");
        %>
        <%for (int i = 0; i < jobs.size(); i++) {
            Job j = jobs.get(i);
            String job1 = j.getJob1();
            String job2 = j.getJob2();
            String job3 = j.getJob3();
            String job4 = j.getJob4();
                
            
        %>
        
        <p>JOB1 : <%=job1%></p>
        <p>JOB2 :<%=job2%></p>
        <p>JOB3 :<%=job3%></p>
        <p>JOB4 :<%=job4%></p>
            
        <%}%>  
        <p>
            
            
            
        click <a href="index.html">here</a> to go back.
    </p>
    </body>
</html>
