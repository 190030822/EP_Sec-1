package ep.StudentMain;

import java.sql.SQLException;

import ep.PreparedStatments.DAO;
import ep.StudentBean.StudentBean;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		StudentBean student=new StudentBean();
		student.setRegno(4);
		student.setName("Raj");
		student.setEmail("Raj@gmail.com");
		DAO insert=new DAO();
		int i=insert.studentInsertion(student);
		if (i>0)
		{
			System.out.println(i+" Rows Inserted Successfully");
		}
		else
		{
			System.out.println("not Inserted Successfully");
		}
		

	}

}
