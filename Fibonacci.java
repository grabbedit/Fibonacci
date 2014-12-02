import java.util.*;
/* 
 * Program takes an integer and prints out the nth term of the
 * Fibonacci sequence.
 * 
 * @author Alex Burkey
 */
public class Fibonacci()
{
	// Name should better reflect what the method is doing.  
	// Something like printFibonacciAt(int lastTerm)
	// This describes in english what the user should expect.  
	public void fibonacciTerm(int lastTerm)
	{
		//Check your input
		// if(lastTerm <= 0){ throw }
		int fibb = 1;
		int lastFibb = 1;
		// potential for endless loop
		// use >= to ensure it will eventually evaluate to false
		for (i = 1; i != lastTerm; i++)
		{
			// consider using a temp here to cut operations in half and only increase memory complexity by 1(a negligible amount in most cases)
			// temp = fibb
			// fibb = fibb + lastFibb;
			// lastFibb = temp;
			fibb = fibb + lastFibb;
			lastfibb = fibb - lastFibb;
		}
		System.out.println(fibb);
	}
}

// I like that you didn't resort to recursion which most people do in this case.  It is almost always the wrong answer.
