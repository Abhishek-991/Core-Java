//WAP to implement queae with rear and front operation .A program must be menu driven .Size of queae must be passed through command line argument.
import java.util.*;
class Queae
{
	int q[];
	Scanner scan;
	int rear=-1;
	int front=-1;
	int n;
	Queae(int size)
	{
		q=new int[size];
		scan=new Scanner(System.in);
	}
	
	void rear()
	{	
		if(rear==q.length-1)
		{
			System.out.println("\n\n QUEAE OVERFLOW");
			//rear=-1;
		}
		else
		{
			System.out.print("\n ENTER NO. TO REAR : ");
			n=scan.nextInt();
			q[++rear]=n;
		}
	}
	
	void front()
	{   
		if(front==rear)
		{
			System.out.println("\n\n QUEAE UNDERFLOW");
		}
		else
		{   
			n=q[++front];
			System.out.print("\n FRONT : "+n);
		}
	}
	
}
public class MyQueae
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int ch=0;
		Queae queae=new Queae(Integer.parseInt(args[0]));
		while(ch!=3)
		{
			System.out.println("\n\n QUEAE MENU : ");
			System.out.println("1. REAR ");
			System.out.println("2. FRONT ");
			System.out.println("3. EXIT ");
			System.out.print("\n SELECT YOUR OPTION : ");
			ch=scan.nextInt();
			
			switch(ch)
			{
				case 1: queae.rear();  break;

				case 2: queae.front();  break;

			}
		}	
	}
}