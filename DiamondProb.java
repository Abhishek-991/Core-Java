interface A
{
void show1();
}
interface B extends A
{
	void show2();
}
class C implements A
{
	public void show1()
	{
		System.out.println("\nIN SHOW OF A");
	}
	void show3()
	{
		System.out.println("\nIN SHOW OF C");
	}
}
class D extends C implements B
{
	public void show2()
	{
		System.out.println("\nIN SHOW OF B");
	}
	void show4()
	{
		System.out.println("\nIN SHOW OF D");
	}
}
public class DiamondProb
{
	public static void main(String[] st)
	{
		D d1=new D();
		d1.show1();
		d1.show2();
		d1.show3();
		d1.show4();
		
		//B b1=new D(); //Dynamic Method Dispatch
		//b1.show2();
	}
}