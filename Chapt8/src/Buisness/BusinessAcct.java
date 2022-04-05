/*

Program: BuisnessAcct.java          Last Date of this Revision: March 17,2022

Purpose: extends and gets info from personal account file

Author: Alisha Saadat 
School: CHHS
Course: Computer Programming 30
 

*/
package Buisness;

public class BusinessAcct extends Account
{
	public BusinessAcct(double bal, String fName, String lName, String str, String city, String st, String zip)
		{
			super(bal, fName, lName, str, city, st, zip);
			
			if (bal < 500)
			{
				bal = bal - 10;
					
				System.out.println("A buisness account requires a minimum balance of $500, a $10 fee has been charged for not meeting the requirements");
		    	toString();
			}
		}
}

	