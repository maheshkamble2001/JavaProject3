package com.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.utility.EmployeeDao;
import java.io.PrintWriter;

@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Employee emp = new Employee();
		emp.setEmpid(Integer.parseInt(request.getParameter("eid")));
		emp.setEmpDate(Date.valueOf(request.getParameter("date")));
		emp.setEmpName(request.getParameter("ename"));
		emp.setEmpSalary(Double.parseDouble(request.getParameter("salary")));
		emp.setEmpEmail(request.getParameter("email"));
		
		emp.setEmpPhoneNumber(Integer.parseInt(request.getParameter("phone")));
		
		emp.setEmpPassword(request.getParameter("pass"));
		EmployeeDao ed = new EmployeeDao();
		
		if(ed.UpdateEmployee(emp)>0)
		{
			out.print("<h1>Employee updated successfully!</h1>");
			request.getRequestDispatcher("ReadAllEmployee.jsp").include(request,response);
		}
		else {
			out.print("<h1>Employee failed to update</h1>");
			request.getRequestDispatcher("ReadAllEmployee.jsp").include(request,response);
		}
	}
}
