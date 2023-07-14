/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bl.JobFacadeLocal;
import bl.StudentFacadeLocal;
import entities.Job;
import entities.Student;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author glodi
 */
public class AddServlet extends HttpServlet {
    @EJB
    StudentFacadeLocal sfl;
    
   
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        Integer number = Integer.parseInt(request.getParameter("number"));
        
        Student student = createStudent(name,number);
        sfl.create(student);
        
        //List<Job> jobs = jfl.findAll();
        
        //request.setAttribute("jobs",jobs);
        RequestDispatcher disp = request.getRequestDispatcher("result.jsp");
        disp.forward(request, response);
        
        
      
    }

    private Student createStudent(String name, Integer number) {
        Student student = new Student();
        
        student.setName(name);
        student.setStudentNumber(number);
        return student;
        
        
    }


}
