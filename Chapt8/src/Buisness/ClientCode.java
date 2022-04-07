/*

	Program: Staff.java          Last Date of this Revision: March 16,2022

	Purpose: Testing out entire University class code 

	Author: Alisha Saadat 
	School: CHHS
	Course: Computer Programming 30
	 

*/
//Tester call
//prints out all from Personal and Buisness with corresponding info
package Buisness;

public class ClientCode 
{
	

	public static void main(String[] args)
	{
		PersonalAcct PA = new PersonalAcct(500,"Crystal ","Johnston ","73 ridge rd","Calgary","AB","tr9o4j");
		BusinessAcct BA = new BusinessAcct(90, "Sam ","Sung ","73","Calgary","AB","trj");

		System.out.println();
		System.out.println(PA.toString());
		System.out.println(BA.toString());		
		}

		
}

/* Screen Dump
(Scenario 1)	 
A personal account requires a minimum balance of $100, a $2 fee has been charged for not meeting the requirements

Crystal  Johnston 
73
Calgary, AB  trj
Current balance is $50.00
Sam  Sung 
73
Calgary, AB  trj
Current balance is $900.00
	
(Scenario 2)
A buisness account requires a minimum balance of $500, a $10 fee has been charged for not meeting the requirements

Crystal  Johnston 
73 ridge rd
Calgary, AB  tr9o4j
Current balance is $500.00
Sam  Sung 
73
Calgary, AB  trj
Current balance is $90.00
	 
*/

