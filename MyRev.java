public class MyRev
{
	public static void main(String[] st)
	{
		String str=st[0];
		String rev="";
		int l=str.length();
		int i;
		for(i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
	System.out.println("\n REVERSE = "+rev);
	}
}
		
		