/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bl.FacultyFacadeLocal;
import bl.JobFacadeLocal;
import entities.Faculty;
import entities.Job;
import java.io.IOException;
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
public class CreateJobServlet extends HttpServlet {
    @EJB
    private JobFacadeLocal jfl;
    @EJB
    private FacultyFacadeLocal ffl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
            String facName = request.getParameter("faculty_name");
            String job1 = request.getParameter("job1");
            String job2 = request.getParameter("job2");
            String job3 = request.getParameter("job3");
            String job4 = request.getParameter("job4");
            
            Job job = createJob(job1,job2,job3,job4);
            jfl.create(job);
            
            Faculty faculty = createFac(facName);
            ffl.create(faculty);
            RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
            disp.forward(request, response);
    }

    private Job createJob(String job1, String job2, String job3, String job4) {
        
        Job job = new Job();
        job.setJob1(job1);
        job.setJob2(job2);
        job.setJob3(job3);
        job.setJob4(job4);
        return job;
        
    }

    private Faculty createFac(String facName) {
        Faculty faculty = new Faculty();
        faculty.setName(facName);
        return faculty;
        
    }


}
