package spring123.spring;

import java.util.List;

public interface DAOInterface   
{
	public int save (Employee e);
	public List<Employee> get();
}
