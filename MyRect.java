import java.util.*;
class Rect
{
double l=0,w=0;
Scanner scan=new Scanner(System.in);
Rect()
{
	System.out.print("\n ENTER LENGTH : ");
	l=scan.nextDouble();
	System.out.print("\n ENTER WIDTH : ");
	w=scan.nextDouble();
}
void area()
{
	double area;
	area=l*w;
	System.out.println("\n\n AREA = "+area);
}
void perimeter()
{
	double perimeter;
	perimeter=2*(l+w);
	System.out.println("\n\n PERIMETER = "+perimeter);
}
void diagonal()
{
	double diagonal;
	diagonal=Math.sqrt((l*l)+(w*w));
	System.out.println("\n\n DIAGONAL = "+diagonal);
}
}

public class MyRect
{
public static void main(String[] st)
{
	Rect r1=new  Rect();
	r1.area();
	r1.perimeter();
	r1.diagonal();
}
}