package spring123.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class DAO implements DAOInterface
{
	private JdbcTemplate jdbctemp;


	public void setJdbctemp(JdbcTemplate jdbctemp) 
	{
		this.jdbctemp = jdbctemp;
	}


	public int save(Employee e) 
	{
		String sqlInsert = "INSERT INTO employ (regno, name, country)"
                + " VALUES (?, ?, ?)";
        return jdbctemp.update(sqlInsert, e.getRegno(), e.getName() , e.getCountry());
		
	}


	public List<Employee> get() 
	{
		String sqldisplay = "select * from employ";
		return jdbctemp.query(sqldisplay, new ResultSetExtractor<List<Employee>>()
				{
					public List<Employee> extractData(ResultSet rs) throws SQLException 
					{
						List<Employee> l1 = new ArrayList<Employee>();
						while(rs.next())
						{
							Employee e =new Employee();
							e.setRegno(rs.getInt(1));
							e.setName(rs.getString(2));
							e.setCountry(rs.getString(3));
							l1.add(e);
						}
						return l1;
					}
					
				}
				);
	
	}
	
}
