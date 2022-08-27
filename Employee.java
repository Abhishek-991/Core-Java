/*	WAP to create class employee which contains employee id, name ,hra,da,pf,total salery, net salery .(Take this variable in double.) 
	Ask user to enter id,name and salery ,and print 10% hra(+),1% da(+), 1% pf(-),total salery,net salery.*/

import java.util.*;
class Emp
{
	double id,sal,hra=0,da=0,pf=0,tot_sal=0,net_sal=0;
	String name;
	Scanner scan=new Scanner(System.in);
	 
	void input()
	{
		System.out.print("\n ENTER EMPLOYEE ID : ");
		id=scan.nextDouble();
		System.out.print("\n ENTER EMPLOYEE NAME : ");
		name = scan.next();
		System.out.print("\n ENTER SALERY : ");
		sal=scan.nextDouble();
	}
	
	void process()
	{
		hra=(sal/10);
		da=(sal/100);
		pf=(sal/100);
		tot_sal=sal + hra + da;
		net_sal=tot_sal - pf;
	}
	
	void output()
	{
		System.out.print("\n\t HRA = "+hra);
		System.out.print("\n\t DA = "+da);
		System.out.println("\n\t PF = "+pf);
		System.out.println("\n\t TOTAL SALERY = "+tot_sal);
		System.out.println("\n\t NET SALERY = "+net_sal);
	}
}

public class Employee
{
	public static void main(String[] st)
	{	
		//Scanner scan=new Scanner(System.in);
		//int i=0;//,n=0;
		//System.out.print("\nENTER NO OF EMPLOYEE : ");
		//n=scan.nextInt();
		Emp e= new Emp();
			e.input();
			e.process();
			e.output();
			//e.input();
			//e.process();
			//e.output();
		
	}
}