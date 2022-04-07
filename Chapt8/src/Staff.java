/*

Program: Staff.java          Last Date of this Revision: March 16,2022

Purpose: gets name and salary from UEmployee and adds job title

Author: Alisha Saadat 
School: CHHS
Course: Computer Programming 30
 

*/
//Extends Uemployee to grab info for staff
//String jobtitle holds title get and set 
public class Staff extends UEmployee
{
	private String title;
	
	public Staff(String fn, String ln, double sal, String jobTitle)
	{
		super(fn, ln, sal);
		title = jobTitle;
	}
	public String getTitle()//Accessor method
	{
		return title;
	}
	public void setTitle(String t)//Modifier method
	{
		title = t;
	}
	public String toString() 
	{
		return(super.getFirstName() + 
				super.getLastName() +
				super.getSalary() + 
				 title);
	}
}
