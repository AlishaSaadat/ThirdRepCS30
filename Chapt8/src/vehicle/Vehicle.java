package vehicle;

/**
 * Vehicle class.
 */
abstract class Vehicle {
	private int entertainment;
	private int seatingAmount;
	private int door;

	/**
	 * constructor 
	 * pre: none
	 * post: A vehicle has been created.
	 */
	public Vehicle(int ET, int seating, int doors) 
	{
		entertainment = ET;
		seatingAmount = seating;
		door = doors;
	}
	
		
	/**
	 * Returns the EY
	 * pre: none
	 * post: The entertaiment has been returned
	 */
	 public int getET() 
	 {
	 	return(entertainment);
	 }
	 
	 public int setET(int e)
	 {
		 return entertainment;
	 }


	/**
	 * Returns the seating amount
	 * pre: none
	 * post: The seating amount has been returned
	 */
	 public int getSeating() 
	 {
	 	return(seatingAmount);
	 }
	 
	 public int setSeat(int s)
	 {
		 return seatingAmount;
	 }

	/**
	 * Returns the door 
	 * pre: none
	 * post: The doors has been returned
	 */
	 public int getdoors() 
	 {
	 	return(door);
	 }
	
	 public int setDoor(int d)
	 {
		 return door;
	 }
	/**
	 * Should return a description of the car's typical use
	 * pre: none
	 * post: A description of the car's typical use has been returned.
	 */
	 abstract String description();
}