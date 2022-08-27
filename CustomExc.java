import java.util.*;
class NegativeAmountException extends Exception
{
	double amount;
	NegativeAmountException(double d)
	{
		amount=d;
	}
	public String toString()
	{
		return "Negative amount : "+amount+" has been caught .";
	}	
}
public class CustomExc
{
	public static void main(String[] st)
	{
		Scanner scan=new Scanner(System.in);
		double amt=0;
		
		try
		{
			System.out.print(" Enter amount : ");
			amt=scan.nextDouble();
			if(amt<0)
			{
				throw new NegativeAmountException(amt);
			}
			else
			{
				System.out.println("\n ENJOY THE AMOUNT : "+amt);
			}
		
		}
		catch(NegativeAmountException ne)
		{
			System.out.println(ne);
		}
	}
}