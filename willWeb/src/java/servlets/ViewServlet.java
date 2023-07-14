/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bl.JobFacadeLocal;
import entities.Job;
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
public class ViewServlet extends HttpServlet {
     @EJB
    JobFacadeLocal jfl;


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         List<Job> jobs = jfl.findAll();
        
         request.setAttribute("jobs",jobs);
         
         RequestDispatcher disp = request.getRequestDispatcher("all.jsp");
        disp.forward(request, response);
      
    }

   

}
