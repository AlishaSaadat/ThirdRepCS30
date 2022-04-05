/*

Program: Car.java          Last Date of this Revision: April 5/2022 

Purpose: extends and gets info from vehicle
Author: Alisha Saadat, 
School: CHHS
Course: Computer Programming 30
 

*/
package vehicle;

public abstract class Car extends Vehicle
{
	private String Tesla;
	
	public Car(int ET, int seating, int doors, String tes)
	{
		 super(ET, seating, doors);
		 Tesla = tes;
	}
	public String getTes()//Accessor method
	{
		return Tesla;
	}
	public void setTes(String o)//Modifier method
	{ 
		Tesla = o;
	}
	
	public String description()//print 
	{	
		return Tesla;
	}
}

