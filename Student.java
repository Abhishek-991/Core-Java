/* WAP to create class student which contains id,name,marks of three subjects , total and percentage.
	Ask user to enter id,name and marks of three subjects and print total percentage with appropriate grade.*/

import java.util.*;

class Stud
{
	Scanner scan=new Scanner(System.in);
	int id=0,total,i=0;
	double percentage=0;
	int mark[]= new int[3];
	String name;
	
	void input()
	{
		System.out.print("\nENTER STUDENT ID : ");
		id=scan.nextInt();
		System.out.print("\nENTER NAME : ");
		name=scan.next();
		System.out.println("\n ENTER MARK OF FOLLOWING SUBJECTS : ");
		System.out.print("\n PHYSICS :  ");
		mark[0]=scan.nextInt();
		System.out.print("\n CHEMISTRY :  ");
		mark[1]=scan.nextInt();
		System.out.print("\n MATHEMATICS :  ");
		mark[2]=scan.nextInt();
	}
	void output()
	{
		total=mark[0]+mark[1]+mark[2];
		System.out.print("\n\n\t GRAND TOTAL = "+total);
	
		percentage = (total/3);
		System.out.println("\n\n\n\t PERCENTAGE = "+percentage);
		
		if(percentage<33)
		{
				System.out.println("\n\t" +name+ " IS FAIL.......");
		}
		else if(33<=percentage&&percentage<60)
		{
				System.out.println("\n\t" +name+ " IS PASS WITH THIRD CLASS.......");
		}
		else if(60<=percentage&&percentage<80)
		{
				System.out.println("\n\t" +name+ " IS PASS WITH SECOND CLASS.......");
		}
		else if(80<=percentage&&percentage<90)
		{
				System.out.println("\n\t" +name+ " IS PASS WITH FIRST CLASS.......");
		}
		else if(percentage>=90)
		{
				System.out.println("\n\t" +name+ " IS PASS WITH DISTINCTION.......");
		}
	}
}

public class Student
{
	public static void main(String[] st)
	{
		
		Stud s=new Stud();
			
			s.input();
			s.output();
			//s[1].input();
			//s[1].output();
	}
}