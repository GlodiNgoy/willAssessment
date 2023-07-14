<%-- 
    Document   : view
    Created on : 14 Jul 2023, 10:21:39 PM
    Author     : glodi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Page</title>
    </head>
    <body>
        <form method="post" action="AddServlet.do">
            <label> Enter Name :</label>
            <input type="text" name="name">    
            <br>
            <label> Student number :</label>
            <input type="text" name="number">    
            <br>
            <button type="submit"> SUBMIT </button>

        </form>

    </body>
</html>
