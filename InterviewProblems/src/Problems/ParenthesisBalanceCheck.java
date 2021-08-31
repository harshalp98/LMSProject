package Problems;

import java.util.Stack;

public class ParenthesisBalanceCheck {

	public static void main(String[] args) {
		String x="())()";
		char s[]=new char[x.length()];
		int top=-1;
		char c[]=x.toCharArray();
		boolean f=false;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='(' || c[i]=='[')
			{
				s[++top]=c[i];
			}
			else if(c[i]==')' || c[i]==']')
			{	
				if(top!=-1) 
				{
					if(s[top]=='(' && c[i]==')' || s[top]=='[' && c[i]==']')
					{
						s[top]=0;
						top--;
					}
					else
					{	
						f=true;
						break;
					}
				}
				else
				{
					f=true;
					break;
				}	
			}
		}
		if( f==false && top==-1)
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");

	}

}
