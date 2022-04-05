package vehicle;

public class Truck 
{
	
}
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
