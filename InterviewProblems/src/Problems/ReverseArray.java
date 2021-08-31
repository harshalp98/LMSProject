package Problems;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,8,9};
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
			
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}

}
