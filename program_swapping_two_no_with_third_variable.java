/* W.A.P in JAVA TO SWAP TWO NUMBERS USING THE THIRD VARIABLE*/

public class Swap
{
	public static void main(String args[])
	{
	 
		int x=20;
		int y=10;
		int temp ;
		System.out.print("Before swapping :" + " x ="+ x +",y=" + y);
	    temp = x;
	    x =y ;
	    y = temp;
		System.out.println("\n Values after swapping :" + " x ="+ x +",y=" + y);
	}
}


