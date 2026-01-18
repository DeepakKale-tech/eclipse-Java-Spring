package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	public static Connection getConnect()
	{
		Connection con = null;
		try
		{
			//Register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudtestdb","root","root");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	
	public static List<Emp> getAllEmp(int start,int pagelimit)
	{
		List<Emp> list = new ArrayList();
		try
		{
			Connection con = getConnect();
			PreparedStatement ps = con.prepareStatement("select * from usertable limit "+(start-1)+","+pagelimit);
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next())
			{
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				
				list.add(e);
			}
			con.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
}
