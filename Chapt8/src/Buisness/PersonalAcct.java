/*

Program: PersonalAcct.java          Last Date of this Revision: March 17,2022

Purpose: extends and gets info from Account file

Author: Alisha Saadat 
School: CHHS
Course: Computer Programming 30
 

*/
package Buisness;

public class PersonalAcct extends Account
{
	public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip)
	{
		super(bal, fName, lName, str, city, st, zip);
		
		if (bal < 100)
		{
			bal = bal - 2;
				
			System.out.println("A personal account requires a minimum balance of $100, a $2 fee has been charged for not meeting the requirements");
	    	toString();
		}
	}
}
