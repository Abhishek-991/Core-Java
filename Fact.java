import java.util.*;
public class Fact
{
public static void main(String[] st)
{
Scanner scan=new Scanner(System.in);
int  no,f=1;

System.out.print("ENTER no:");
no=scan.nextInt();
while(no>=1)
{
	f=f*no;
	no--;
}
System.out.print("\n\n FACTORIAL ="+f);
}
}