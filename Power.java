import java.util.*;

public class Power
{
	public static void main(String[] pow)
	{
		Scanner scan=new Scanner(System.in);
		int i,no,p=1;
		System.out.print("ENTER NO. : ");
		no=scan.nextInt();
		if(no!=0)
		{
			for(i=1;i<=no;i++)
			{
				p=p*no;
			}
			System.out.println("POWER IS :"+p);
		}
		else
		{
			System.out.print("POWER IS :0");
		}
	}
}