package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.Comment;
import util.Databaseutil;

public class Datab {
	public boolean insert(Comment c)
	{
		int result=0;
		try
		{
		Connection con=Databaseutil.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into feedback values (?,?,?,?)");
		ps.setString(1,c.getName());
		ps.setString(2,c.getEmail());
		ps.setString(3,c.getWebsite());
		ps.setString(4,c.getFeedback());
		result=ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		if(result>0)
			return true;
		else
			return false;
	}
	
	

}
