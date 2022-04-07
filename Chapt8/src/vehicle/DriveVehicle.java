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
