/*W.A.P in JAVA to find the  factorial of  a number*/

public class Factorial
{
	static int factorial(int n)
	{
	 	int r=1,i;
	 	for(i=2;i<=n;i++)
	 		r=r*i;
		return r;
	}

	public static void main(String args[])
	{ 
		int num=9;
		System.out.println("Factorial of "+ num +" is " + factorial(num));
	}
}
	