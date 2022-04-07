/*

Program: testUni.java          Last Date of this Revision: March 16,2022

Purpose: Testing out entire University class code 

Author: Alisha Saadat 
School: CHHS
Course: Computer Programming 30
 

*/
//Tester call
//prints out all from facutly,. Uemployee, and Staff with corresponding info
public class testUni 
{
	public static void main(String[] args)
	{
		Staff staff1 = new Staff("Crystal ","Johnston ",7500," Receptionist");
		Faculty faculty1 = new Faculty("Sam ","Sung ",98000," Professor ","Education Department");
		
		System.out.println(staff1.getFirstName() + staff1.getLastName() + 
				" makes: " + staff1.getSalary() + " and is a " + staff1.getTitle());
		System.out.println(faculty1.getFirstName() + faculty1.getLastName() + 
				" makes: " + faculty1.getSalary() +" as a " + faculty1.getTitle() + "in the " + faculty1.getDept());
		
		System.out.println();
		System.out.println(staff1.toString());
		System.out.println(faculty1.toString());
	}

	
}

/* Screen Dump
 
Crystal Johnston  makes: 7500.0 and is a  Receptionist
Sam Sung  makes: 98000.0 as a  Professor in the Education Department

Crystal Johnston 7500.0 Receptionist
Sam Sung 98000.0 Professor Education Department
 
 */
