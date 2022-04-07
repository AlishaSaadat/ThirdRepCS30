/*

Program: Car.java          Last Date of this Revision: April 7/2022 

Purpose: extends and gets info from vehicle
Author: Alisha Saadat, 
School: CHHS
Course: Computer Programming 30
 

*/
//Extends Vehicle
//gets and sets info for car
package vehicle;

public class Car extends Vehicle
{
	private String car;
	
	public Car(int ET, int seating, int doors, String ca)
	{
		 super(ET, seating, doors);
		 car = ca;
	}
	public String getcar()//Accessor method
	{
		return car;
	}
	public void setcar(String o)//Modifier method
	{ 
		car = o;
	}
	@Override
	String description() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
/*	public String toString()
	{
		return "This car has 240 horse power";
	}
	*/
}

