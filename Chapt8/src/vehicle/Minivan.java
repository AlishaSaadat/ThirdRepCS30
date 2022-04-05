/*

Program: Minivan.java          Last Date of this Revision: April 5/2022 

Purpose: extends and gets info from vehicle
Author: Alisha Saadat, 
School: CHHS
Course: Computer Programming 30
 

*/
package vehicle;

public class Minivan extends Vehicle
{
	private String Odyssey;
	
	public Minivan(int ET, int seating, int doors, String Ody)
	{
		super(ET, seating, doors);
		Odyssey = Ody;
	}
	public String getOdy()//Accessor method
	{
		return Odyssey;
	}
	public void setOdy(String o)//Modifier method
	{ 
		Odyssey = o;
	}
	
	public String description()//print 
	{
		return Odyssey;
	}
}
