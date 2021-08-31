package Problems;

public class Anagrams {

	public static void main(String[] args) {
		String s1="peek";
		String s2="keep";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		if(s1.length()!=s2.length())
			System.out.println("not same lenght");
		else {
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c2.length;j++)
			{
				if(c1[i]==c2[j])
				{
					char temp=c1[i];
					c1[i]=c1[j];
					c1[j]=temp;
				}
			}
		}
		}
		boolean f=false;
		for(int j=0;j<c1.length;j++)
		{
			if(c1[j]!=c2[j])
			{
				f=true;
				break;
			}
		}
		if(f==false)
			System.out.println("anagrams");
		else
			System.out.println("not anagrams");
		
//		String x1=new String(c1);
//		String x2=new String(c2);
//		if(x1.equalsIgnoreCase(x2))
//			System.out.println("anagrams");
//		else
//			System.out.println("not anagrams");
		
	}

}
