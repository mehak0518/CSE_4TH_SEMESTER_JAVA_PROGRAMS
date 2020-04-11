/* W.A.P in JAVA TO SWAP TWO NUMBERS WITHOUT USING THE THIRD VARIABLE*/

public class Swap
{
	public static void main(String args[])
	{
		int x=20;
		int y=10;
		System.out.println("Before swapping :" + " x ="+ x +",y=" + y);/*print values of x and y before swapping */
		x=x+y; // Here x=30 i.e (20+10=30)
 		y=x-y;//  Here y=20 i.e (30-10=20)
		x=x-y;//  Here x=   i.e (30-20=10)
		System.out.println("After swapping the values are:"+"x="+ x +", y=" +y);/*print values of x and y before swapping */
	}
}