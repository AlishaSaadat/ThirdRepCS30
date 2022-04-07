/*

Program: Truck.java          Last Date of this Revision: April 5/2022 

Purpose: extends and gets info from vehicle
Author: Alisha Saadat, 
School: CHHS
Course: Computer Programming 30
 

*/
package vehicle;

public class Truck extends Vehicle
{
	private String Semi;
	
	public Truck(int ET, int seating, int doors, String sem)
	{
		super(ET, seating, doors);
		Semi = sem;
	}
	public String getSem()//Accessor method
	{
		return Semi;
	}
	public void setSem(String o)//Modifier method
	{ 
		Semi = o;
	}
	
	public String description()//print 
	{
		return " ";
	}
}
