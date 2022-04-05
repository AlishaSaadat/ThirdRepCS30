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
		return Semi;
	}
}
