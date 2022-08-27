import java.util.*;
public class Multi_tab
{
	public static void main(String[] mul)
	{
		int no=0,i=1;
		System.out.print("ENTER A NUMBER : ");
		Scanner scan=new Scanner(System.in);
		
		no=scan.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(no+ "*"+i+"="+(no*i));
		}
	}
}