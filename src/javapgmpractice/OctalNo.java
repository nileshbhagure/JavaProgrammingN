package javapgmpractice;

public class OctalNo 
{

	public static void main(String[] args)
	{
		//No starting with 0 is called as Octal no
		// we have octal no- 0 to 7 only
		//every digit should be between 0 to 7 eg 065 011
		
		byte b=065;
		System.out.println(b);//53 converted into decimal no
		
		/*octal no base is 8		             
		 065=(0*8^2)+(6*8^1)+(5*8^0)
		    =0+48+5
		    =53
		cal will start from left to right */
		
		
		int b4=076565;
		System.out.println(b4); //32117
		   
		
	}

}
