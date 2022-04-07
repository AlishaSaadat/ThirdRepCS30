/*

Program: DriveVehicle.java          Last Date of this Revision: April 7/2022 

Purpose: extends and gets info from vehicle
Author: Alisha Saadat, 
School: CHHS
Course: Computer Programming 30
 

*/
//Tester call
//asks user to choose a vehicle type or quit
//prints out all from Car, Minivan, and truck with corresponding info with chosen vehicle
package vehicle;

import java.util.Scanner;

public class DriveVehicle
{

	public static void main(String[] args) 
	{
		Car c = new Car(2, 5, 4, "Tesla");
		Minivan m = new Minivan(2, 8, 4, "Oddesey");
		Truck t = new Truck(1, 2, 2, "Semi");
		
		Scanner input = new Scanner(System.in);
		
		String action;
		
		do
		{
			System.out.println("\nCar\\Minivan\\Truck\\Quit");
			System.out.println("Enter choice: ");
			action = input.next();

			if(action.equalsIgnoreCase("C"))
			{
				System.out.println(c);
			}
			else if(action.equalsIgnoreCase("M"))
			{
				System.out.println(m);
			}
			else if(action.equalsIgnoreCase("T"))
			{
				System.out.println(t);
			}
			else if(!action.equalsIgnoreCase("Q"))
			{
				System.out.println("");
			}
			
		}while(!action.equalsIgnoreCase("Q"));
		
		
	}
}
/* Screen Dump


Car\Minivan\Truck\Quit
Enter choice: 
c
This vehicle has entertainment: 2 and has 5 seats also has 4 doors.

Car\Minivan\Truck\Quit
Enter choice: 
t
This vehicle has entertainment: 1 and has 2 seats also has 2 doors.

Car\Minivan\Truck\Quit
Enter choice: 
m
This vehicle has entertainment: 2 and has 8 seats also has 4 doors.

Car\Minivan\Truck\Quit
Enter choice: 

q


 */
