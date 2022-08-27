import Ba.*;
import Atm.*;
import java.util.*;

class Customer extends Bank implements Atm
{
	String customer_name;
	Scanner scan=new Scanner(System.in);
	int acc_mode=0;
	Customer()
	{
		super Bank();
		System.out.print("\n ENTER CUSTOMER NAME : ");
		c_name=scan.next();
		System.out.print("\n ENTER AGE : ");
		age=next.Int();
		System.out.print("\n SELECT ACCOUNT TYPE : ");
		System.out.print("\n 1.SAVING MAJOR");
		System.out.print("\n 2.CURRENT");
		System.out.print("\n 3.SAVING MINOR");
		acc_mode=scan.nextInt();
	}
	public void details()
	{
		System.out.println("FOR BRANCH DETAILS PRESS 1");
		System.out.println("FOR CUSTOMER DETAILS PRESS 2");
		if(no==1)
		{
			System.out.println("BRANCH DETAILS : ");
			public void ifsc();
			public void micr();
			public void add();
		}
		else if(no==2)
		{
			System.out.print("\n CUSTOMER NAME : "+c_name);
			System.out.print("\n CUSTOMER AGE : "+age);
			System.out.print("\n ACCOUNT TYPE : ");
			if(acc_mode==1)
			{System.out.print("SAVING MAJOR");}
			else if(acc_mode==2)
			{System.out.print("CURRENT");}
			else if(acc_mode==3)
			{System.out.print("SAVING MINOR");}
		}
	}
	public void atm_lim()
	{
		if(acc_mode==1)
		{
			max_wid=30000;
			System.out.println("\n MAXIMUM WITHDRAWL : "+max_wid);
		}
		else if(acc_mode==2)
		{
			max_wid=50000;
			System.out.println("\n MAXIMUM WITHDRAWL : "+max_wid);
		}
		else if(acc_mode==3)
		{
			max_wid=10000;
			System.out.println("\n MAXIMUM WITHDRAWL : "+max_wid);
		}
	}
}