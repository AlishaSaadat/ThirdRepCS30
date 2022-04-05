/*

Program: Faculty.java          Last Date of this Revision: March 16,2022

Purpose: gets info from staff and uemployee and adds department name.

Author: Alisha Saadat 
School: CHHS
Course: Computer Programming 30
 

*/
public class Faculty extends Staff
{
	private String DName;
	
	public Faculty(String fn, String ln, double sal, String jobTitle, String dname) 
	{
		super(fn, ln, sal, jobTitle);
		DName = dname;
		
	}
	public String getDept()//Accessor method
	{
		return DName;
	}
	public void setDept(String d)//Modifier method
	{
		DName = d;
	}
	
	public String toString()//prints Employee Object 
	{
		return(super.toString() + DName);
	}

}