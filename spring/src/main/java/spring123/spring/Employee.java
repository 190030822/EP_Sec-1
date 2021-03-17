package spring123.spring;

public class Employee
{
	private int regno;
	private String name;
	private String country;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee [regno=" + regno + ", name=" + name + ", country=" + country + "]";
	}
	
	
}
