package Problems;
//1 3 7 15 31 63 127 
public class SeriesPrb {

	public static void main(String[] args) {
		int j=0;
		for(int l=0;l<7;l++)
		{
			j=j+1+j;
			System.out.print(j+" ");
		}
		System.out.println();
		int a=32;
		int b=77;
		if(a++%2==0)
		{
			System.out.println(a);
			if(b--%4==0)
				System.out.println(b);
			else
				System.out.println(b);
		}

	}

}
