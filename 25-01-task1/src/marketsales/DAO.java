package marketsales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO
{
	public int insertQuerey(Bean sales) throws ClassNotFoundException, SQLException
	{
		Connection con=DButil.getConnection();
		
		String sql="Insert into salestable values(?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, sales.getItemid());
		st.setString(2,sales.getItemname());
		st.setFloat(3, sales.getItemcost());
		return st.executeUpdate();
	}
	public void displayQuerey() throws ClassNotFoundException, SQLException
	{
		Connection con=DButil.getConnection();
		String sql="select * from salestable";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		}
	}
	public void toatlcost() throws ClassNotFoundException, SQLException
	{
		Connection con =DButil.getConnection();
		String sql="select sum(Itemcost) from salestable";
		PreparedStatement st=con.prepareStatement(sql);
		ResultSet rs= st.executeQuery();
		while(rs.next())
		{
		System.out.println(rs.getFloat(1));
		}
	}
	public void Itemsdisplay() throws ClassNotFoundException, SQLException
	{
		Connection con=DButil.getConnection();
		String sql="select Itemname from salestable";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
	}
}
