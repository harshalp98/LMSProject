package Problems;

public class FibonacciSeriesUsingReccursion {
	static int a=0,b=1,c;
	public static void main(String[] args) {
		FibonacciSeriesUsingReccursion fs=new FibonacciSeriesUsingReccursion();
		//System.out.print(a+" "+b);
		fs.find(10);

	}
	public void find(int n)
	{
		if(n>0)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			find(n-1);
		}
		
	}
}
