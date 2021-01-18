package ep.PreparedStatments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import ep.DBConnection.DBConnection;
import ep.StudentBean.StudentBean;

public class DAO 
{
	public int studentInsertion(StudentBean student) throws ClassNotFoundException, SQLException
	{
		Connection con=DBConnection.getConnection();
		String sql="insert into studentDetails values(?,?,?)";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setInt(1,student.getRegno());
		stmt.setString(2,student.getName());
		stmt.setString(3,student.getEmail());
		
		return stmt.executeUpdate();
	}
}
