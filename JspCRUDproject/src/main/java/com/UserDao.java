package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

	public static Connection getConnection()
	{
		Connection con = null;
		try
		{
			//Register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Make connection
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdb","root","root");
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
			Connection con = UserDao.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into users(id,name,age,password,city) values(?,?,?,?,?)");
			ps.setInt(1, u.getId());
			ps.setString(2, u.getName());
			ps.setInt(3, u.getAge());
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
	
	public static List<User> getUsers()
	{
		List<User> list = new ArrayList<User>();
		try
		{
			Connection con= UserDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from users");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				User u = new User();
				
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setAge(rs.getInt(3));
				u.setPassword(rs.getString(4));
				u.setCity(rs.getString(5));
				
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
