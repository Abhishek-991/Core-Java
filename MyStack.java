//WAP to implement stack with push and pop operation .A program must be menu driven .Size of stack must be passed through command line argument.
import java.util.*;
class Stack
{
	int st[];
	Scanner scan;
	int top;
	Stack(int size)
	{
		st=new int[size];
		scan=new Scanner(System.in);
		top=-1;
	}
	
	void push()
	{
		int n;
		if(top==st.length-1)
		{
			System.out.println("\n\n STACK OVERFLOW ");
		}
		else
		{
			System.out.println("\n ENTER NO TO PUSH : ");
			n=scan.nextInt();
			st[++top]=n;
		}
	}
	
	void pop()
	{
		int n;
		if(top==-1)
		{
			System.out.println("\n\n STACK UNDERFLOW ");
		}
		else
		{
			n=st[top--];
			System.out.print("\n POP : "+n);
		}
	}
}
public class MyStack
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int ch=0;
		Stack stack=new Stack(Integer.parseInt(args[0]));
		while(ch!=3)
		{
			System.out.println("\n\n STACK MENU : ");
			System.out.println("1. PUSH ");
			System.out.println("2. POP ");
			System.out.println("3. EXIT ");
			System.out.println("\n SELECT YOUR OPTION : ");
			ch=scan.nextInt();
			
			switch(ch)
			{
				case 1: stack.push();  break;

				case 2: stack.pop();  break;

			}
		}	
	}
}