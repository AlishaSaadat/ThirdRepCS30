/*

Program: UEmployee.java          Last Date of this Revision: March 15,2022

Purpose: Get user first name, last name, and Salary

Author: Alisha Saadat 
School: CHHS
Course: Computer Programming 30
 

*/
//Main class 
//String firstname, lastname, and salary holds each one get and set
public abstract class UEmployee 
{
	private String firstName, lastName;
	private double salary;

	
	public UEmployee(String fn, String ln, double sal)// 
	{
		firstName = fn;
		lastName = ln;
		salary = sal;
	}
	
	public String getFirstName()//Accessor method
	{
		return firstName;
	}
	public String getLastName()//Accessor method
	{
		return lastName;
	}
	public double getSalary()//Accessor method
	{
		return salary;
	}
	public void setFirstName(String fn)//Modifier method
	{
		firstName = fn;
	}
	public void setLastName(String ln)//Modifier method
	{
		lastName = ln;
	}
	public void setSalary(double sal)//Modifier method
	{
		salary = sal;
	}
}
