package javapgmpractice;

public class SumOfArray 
{

	public static void main(String[] args) 
	{
		int p[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0; i<p.length;i++)
		{
			sum=sum+p[i];
		}
		System.out.println(sum);//15  1+2+3+4+5=15
	}

}
