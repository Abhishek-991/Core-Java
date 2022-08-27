//WAP to create custom exception WrongGenderException if entered gender is othe than M or F.
import java.util.*;
class WrongGenderException extends Exception
{
	String gender;
	WrongGenderException(String g)
	{
		gender=g;
	}
	public String toString()
	{
		return "\nPLEASE ENTER M FOR MALE AND F FOR FEMALE\n";
	}
}
public class Gender
{
	public static void main(String[] st)
	{
		Scanner scan=new Scanner(System.in);
		String name;
		int age=0;
		String gender,g1="MALE",g2="FEMALE";
		try
		{
			System.out.print("ENTER YOUR NAME : ");
			name=scan.next();
			System.out.print("ENTER YOUR AGE : ");
			age=scan.nextInt();
			System.out.print("ENTER YOUR GENDER : ");
			gender=scan.nextLine();
			if(gender!="M"||gender!='F')
			{
				throw new WrongGenderException(gender);
			}
			else
			{
				System.out.print("YOUR GENDER IS : "+gender);
			}
		}
		catch(WrongGenderException gen)
		{
			System.out.print(gen);
			
		}
	}
}
