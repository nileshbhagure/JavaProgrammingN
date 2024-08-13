package javapgmpractice;

public class HighestAmong3No 
{
	
	
	public static void main(String[] args) 
	{
		
		int a=100;
		int b=200;
		int c=300;
		
		// && operator is called short circut operator
		// first condition is false then it will come out(short circuit) 
		
		if(a>b && a>c) //false & false= false
		{
			System.out.println("a is greatest");
		}
		else if(b>c)  //false
		{
			System.out.println("b is greatest");
		}
		else
		{
			System.out.println("c is greatest");
		}
	}

}
