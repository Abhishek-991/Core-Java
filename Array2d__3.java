import java.util.*;
public class Array2d__3
{
	public static void main(String[] st)
	{
		int a[][],s=0,i=0,j=0;
		System.out.print("ENTER ROW:");
		Scanner scan=new Scanner(System.in);
		r=scan.nextInt();
		a=new int[3][3];
		/*for(i=0;i<r;i++)
		{
			System.out.print("ENTER COLUMN FOR "+(i+1)+" ROW : ");
			c=scan.nextInt();
			a[i]=new int[c];
		}*/
		System.out.print("\n");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print("ENTER NO FOR "+(i+1)+" ROW AND "+(j+1)+" COLUMN : ");
				a[i][j]=scan.nextInt();
			}
					System.out.print("\n");
		}
		System.out.print("\n");
		/*for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(" "+y);
				s=s+y;
			}
			System.out.print("\n");
		}
		System.out.print("\tSUM= "+s);
		
		*/
		for(i=0;i<3;i++)
		{
			for(j=1;j<=i;j++)
			{
				
		
	}
}	
