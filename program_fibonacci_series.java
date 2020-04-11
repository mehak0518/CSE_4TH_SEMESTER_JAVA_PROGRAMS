/*W.A.P in JAVA to find the  print fibonaaci series  upto n numbers*/

public class Fibo_n
{
	static void printFibo(int n)
	{
		int x=0 , y=1 , i;
		if ( n < 1)
			return ;
		for(i = 0; i <= n ;i++)
		{
			Sytem.out.pritln(y+" ");
				int r=x+y;
				x=y;
				y=r;
		}
	}
	public static void main (String args[] )
	{
		printFibo(11);
	}
}

