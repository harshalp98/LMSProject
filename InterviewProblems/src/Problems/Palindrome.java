package Problems;

public class Palindrome {
	
	public static void main(String[] args) {
		String s="Madam";
		String s1=s.toUpperCase();
		int j=s1.length()-1;
		boolean f=false;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s1.charAt(j))
			{
				f=true;
				break;
			}
			j--;
		}
		if(f==true)
			System.out.println("not Palindrome");
		else
			System.out.println("Palindrome");

	}

}
