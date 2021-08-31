package Problems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		for(int i=1;i<=10;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
	}

}
