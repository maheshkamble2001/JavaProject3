package com.utility;

import java.sql.Connection;
import java.sql.Date;
import java.util.Calendar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import com.model.Employee;
import java.util.List;
public class EmployeeDao {
	public int AddEmployee(Employee emp)
	{
		PreparedStatement ps = null;
		int val=0;
		try
		{
		Connection con = DBConnection.DBConnectivity();
		String sql = "INSERT INTO EMP VALUES(?,?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setInt(1, emp.getEmpid());
		ps.setDate(2,emp.getEmpDate());
		ps.setString(3,emp.getEmpName());
		ps.setDouble(4,emp.getEmpSalary());
		ps.setString(5,emp.getEmpEmail());
		ps.setInt(6,emp.getEmpPhoneNumber());
		ps.setString(7,emp.getEmpPassword());
		val = ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.println("Exception occured in add employee "+e);
		}
		return val;
	}
	public int UpdateEmployee(Employee emp)
	{
		PreparedStatement ps = null;
		int val=0;
		try
		{
		Connection con = DBConnection.DBConnectivity();
		String sql = "UPDATE EMP SET  NAME=?,SALARY=?,EMAIL=?,PHONE=?,PASSWORD=?WHERE ID=?";
		ps = con.prepareStatement(sql);
		ps.setInt(6, emp.getEmpid());
		ps.setString(1,emp.getEmpName());
		ps.setDouble(2,emp.getEmpSalary());
		ps.setString(3,emp.getEmpEmail());
		ps.setInt(4,emp.getEmpPhoneNumber());
		ps.setString(5,emp.getEmpPassword());
		val = ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.println("Exception occured in update employee "+e);
		}
		return val;
	}
	
	public int DeleteEmployee(Employee emp)
	{
		PreparedStatement ps= null;
		int val=0;
		try
		{
		Connection con = DBConnection.DBConnectivity();
		String sql = "DELETE FROM EMP WHERE ID=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, emp.getEmpid());
		val = ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.println("Exception occured in delete employee "+e);
		}
		return val;
	}
	
	public List<Employee> getAllEmployee()
	{
		List<Employee> list = new ArrayList<Employee>();
		PreparedStatement ps = null;
		try {
			Connection con = DBConnection.DBConnectivity();
			String sql  = "SELECT * FROM EMP";
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				list.add(new Employee(rs.getInt(1),rs.getDate(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getInt(6),rs.getString(7)));
			}
		}catch(Exception e)
		{
			System.out.print("Exception occured in get all employee"+e);
		}
		
		return list;
	}
}
