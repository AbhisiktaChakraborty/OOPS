class Factorial 
{
	public static void main(String a[])
	{
		int n=Integer.parseInt(a[0]),f=1;
		for (int i=1;i<=n;i++)
		{
			f*=i;
		}
		System.out.println(f);
	}
}
