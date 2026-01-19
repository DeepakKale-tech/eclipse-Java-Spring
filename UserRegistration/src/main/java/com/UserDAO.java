package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

	public static Connection getConnect()
	{
		Connection con = null;
		try
		{
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//connect
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudtestdb","root","root");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	
	public static int saveUser(User u)
	{
		int status=0;
		try
		{
			Connection con = UserDAO.getConnect();
			PreparedStatement ps = con.prepareStatement("insert into users(name,age,email,password,city) values(?,?,?,?,?)");
			ps.setString(1, u.getName());
			ps.setInt(2, u.getAge());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPassword());
			ps.setString(5, u.getCity());
			
			status = ps.executeUpdate();
			
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
	
	public static User getUser(String email)
	{
		User u = new User();
		try
		{
			Connection con = UserDAO.getConnect();
			PreparedStatement ps = con.prepareStatement("select * from users where email=?");
			ps.setString(1, email);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setAge(rs.getInt(3));
				u.setEmail(rs.getString(4));
				u.setPassword(rs.getString(5));
				u.setCity(rs.getString(6));
			}
			
			con.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return u;
	}
	
	public static List<User> getAll()
	{
		List<User> list = new ArrayList();
		
		try
		{
			Connection con = UserDAO.getConnect();
			PreparedStatement ps = con.prepareStatement("select * from users");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				User u = new User();
				
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setAge(rs.getInt(3));
				u.setEmail(rs.getString(4));
				u.setPassword(rs.getString(5));
				u.setCity(rs.getString(6));
				
				list.add(u);
			}
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
	
}
