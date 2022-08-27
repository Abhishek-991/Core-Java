public class MyStr
{
	public static void main(String[] st)
	{

	
	int a[]=new int[st.length-1];
	int i,j,t;
	for(i=0;i<a.length;i++)
	{
		a[i]=Integer.parseInt(st[i]);
	}
	char ch=st[st.length-1].charAt(0);
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(ch=='A'||ch=='a')
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
			else
			{
				if(a[i]<a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
	System.out.print("  "+a[i]);
	}
	}
}