package Problems;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	//second way	
//		int a=0;
//		int b=1;
//		int c;
//		System.out.print(a+" "+b);
//		for(int i=1;i<=10;i++)
//		{
//			c=a+b;
//			System.out.print(" "+c);
//			a=b;
//			b=c;
//		}
		
		
	}

}
