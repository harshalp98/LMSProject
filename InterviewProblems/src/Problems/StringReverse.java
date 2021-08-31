package Problems;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		String s="Harsh";
		char c[]=s.toCharArray();
		int j=c.length-1;
		for(int i=0;i<c.length/2;i++)
		{
			char temp=c[j];
			c[j]=c[i];
			c[i]=temp;
			j--;
		}
		String s1=new String(c);
		System.out.println(s1);
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		//by using reverse function
		StringBuffer b=new StringBuffer(s);
		System.out.println(b.reverse());
		
		String x="Hello hi harsh hiiii";
		String x1[]=x.split(" ");
		int l=x1.length-1;
		String s3="";
		for(int i=x1.length-1;i>=0;i--)
		{
//			String temp=x1[i];
//			x1[i]=x1[l];
//			x1[l]=temp;
			s3=s3+x1[i]+" ";
		}
		System.out.println(s3);
		
		
		
		
	}

}
