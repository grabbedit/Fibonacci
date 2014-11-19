/**
 * @param n integer sequence place request
 * @return fibb nth term in the fibonacci sequence
 */
public int fibonacciTerm(int n)
{
	int fibb = 1;
	int lastFibb = 1;
	for (i = 1; i != n; i++)
	{
		fibb = fibb + lastFibb;
		lastfibb = fibb - lastFibb;
	}
	System.out.println(fibb);
}