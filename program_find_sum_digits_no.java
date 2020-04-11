/*W.A.P in JAVA to find the Sum of digits of a number*/

public class Sum_digit_no
{
	static int  Sum(int n)
	{ 
		int s=0;
		while(n!=0)
		{
	 		s=(s+(n%10));
		 	n=n/10;
		}
		return s;
	}
	
	public static void main(String args[])
	{
		int n=9867;
		System.out.println(Sum(n));
	}
}
