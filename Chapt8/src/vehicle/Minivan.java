/*

Program: Minivan.java          Last Date of this Revision: April 7/2022 

Purpose: extends and gets info from vehicle
Author: Alisha Saadat, 
School: CHHS
Course: Computer Programming 30
 

*/
//Extends Vehicle
//gets and sets info for minivan
package vehicle;

public class Minivan extends Vehicle
{
	private String minivan;
	
	public Minivan(int ET, int seating, int doors, String mini)
	{
		super(ET, seating, doors);
		minivan = mini;
	}
	public String getMini()//Accessor method
	{
		return minivan;
	}
	public void setMini(String o)//Modifier method
	{ 
		minivan = o;
	}
	@Override
	String description() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
