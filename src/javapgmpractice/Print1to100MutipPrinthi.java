package javapgmpractice;

public class Print1to100MutipPrinthi
{

	public static void main(String[] args) 
	{
// 1to100: mutiplication of 7-->print "hi"
		
	for(int t=1; t<=100; t++)
	{
		System.out.println(t);
		// % operator gives remainder
		if(t%7==0)
			System.out.println("-------hi---");
	}

	}

}
