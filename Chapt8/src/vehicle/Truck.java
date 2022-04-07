/*

Program: Truck.java          Last Date of this Revision: April 7/2022 

Purpose: extends and gets info from vehicle
Author: Alisha Saadat, 
School: CHHS
Course: Computer Programming 30
 

*/
//Extends Vehicle
//gets and sets info for truck
package vehicle;

public class Truck extends Vehicle
{
	private String truck;
	
	public Truck(int ET, int seating, int doors, String tr)
	{
		super(ET, seating, doors);
		truck = tr;
	}
	public String getTr()//Accessor method
	{
		return truck;
	}
	public void setTr(String o)//Modifier method
	{ 
		truck = o;
	}
	@Override
	String description() {
		// TODO Auto-generated method stub
		return null;
	}
}

