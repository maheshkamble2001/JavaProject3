package com.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import com.model.Employee;
import com.utility.EmployeeDao;

@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Employee emp = new Employee();
		emp.setEmpid(Integer.parseInt(request.getParameter("eid")));
		EmployeeDao ed = new EmployeeDao();
		
		if(ed.DeleteEmployee(emp)>0)
		{
			out.print("<h1>Employee deleted successfully!</h1>");
			request.getRequestDispatcher("ReadAllEmployee.jsp").include(request,response);
		}
		else {
			out.print("<h1>Employee failed to delete</h1>");
			request.getRequestDispatcher("ReadAllEmployee.jsp").include(request,response);
		}
	}

}
