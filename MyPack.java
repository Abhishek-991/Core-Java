import Pack_ms.*;
import Pack_gtu.Circle;
class Box3d extends Box
{
	int height,volume;
	Box3d(int l,int w,int h)
	{
		super(l,w);
		height=h;
	}
	int volume()
	{
		volume=area*height;
		return volume;
	}
	void show()
	{
		Show();
		int vol=volume();
		System.out.println("\nHEIGHT : "+height+"\nVOLUME OF BOX : "+vol);
	}
}
public class MyPack
{
	public static void main(String[] Ap)
	{
		Box3d b=new Box3d(10,20,30);
		Circle c=new Circle(12.5f);
		b.show();
		c.display();
	}
}
