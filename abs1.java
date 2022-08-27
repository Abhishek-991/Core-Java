abstract class Vehicle
{
	abstract void noOfwheels();
	abstract void capacity();
}
class Bike extends Vehicle
{
	void noOfwheels()
	{
		System.out.println("\n Wheels : "+2);
		capacity();
	}
	void capacity()
	{
		System.out.println("\n Capacity : "+2);
	}
}

abstract class Car extends Vehicle
{
	
	void noOfwheels()
	{
		System.out.println("\n Wheels : "+4);
	}
	
}

class Swift extends Car
{
	void capacity()
	{
		noOfwheels();
		System.out.println("\n Capacity : "+5);
	}
}

public class abs1
{
	public static void main(String[] st)
	{
		Bike b= new Bike();
		Swift s= new Swift();
		b.noOfwheels();
		s.capacity();
	}
}
