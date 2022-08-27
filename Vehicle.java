//WAP to create a class vehicle which contains Registration number ,Company name, model name and Average.Pass all values through command line argument.
import java.util.*;
class VehicleInfo
{
	VehicleInfo(String reg_no,String comp_name,String model_name)
	{
		
		System.out.print("\n Registration No. :"+reg_no);
		System.out.print("\n Company Name : "+comp_name);
		System.out.print("\n Model No. :"+model_name);
	}
}
public class Vehicle
{	
	public static void main(String[] st)
	{	
		String reg_no=st[0];
		String comp_name=st[1];
		String model_name=st[2];
		
		VehicleInfo v1=new VehicleInfo(reg_no,comp_name,model_name);
	}
}