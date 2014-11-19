import java.util.*;
/* 
 * Program takes an integer and prints out the nth term of the
 * Fibonacci sequence.
 * 
 * @author Alex Burkey
 */
public class Fibonacci()
{
	public void fibonacciTerm(int lastTerm)
	{
		int fibb = 1;
		int lastFibb = 1;
		for (i = 1; i != lastTerm; i++)
		{
			fibb = fibb + lastFibb;
			lastfibb = fibb - lastFibb;
		}
		System.out.println(fibb);
	}
}