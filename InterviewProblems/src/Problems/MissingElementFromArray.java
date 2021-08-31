package Problems;

import java.util.Arrays;

public class MissingElementFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6};
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1+=a[i];
		}
		
		int sum2=0;
		for(int i=1;i<=6;i++)
		{
			sum2+=i;
		}
		System.out.println(sum2-sum1);
			
//		for(int i=0;i<a.length;i++)
//		{	boolean f=false;
//			num=num+1;
//			if(num==a[i])
//				f=true;
//			else
//				System.out.print(num+" ");
//		}
		

	}

}
