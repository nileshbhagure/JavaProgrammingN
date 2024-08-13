package exception.handling;
/*
 * throws-Throws keyword in Java is used in the method declaration.
 *        It provides information to the caller method about exceptions being thrown and the caller method has to takethe responsibility of handling the exception.
          Throws keyword is used in case of checked exception only.
 *      -when we need to passpass the exception
 * 
 */

public class ThrowsKeyword 
{
   public static void addToCart()
   {
	   System.out.println("adding to card");
	   doPayment();
   }
   
   public static void generateOrderId(int num) throws ArithmeticException
   {
	   System.out.println("generateOrderId");
       int i=9/num;
   }
   
   public static void doPayment()
   {
	   System.out.println("doPayment");
	   //calling method responsiblity to handle exception if its not taken care by tge method
	   //immediate level or hirrearch level exception need to handle
	   try {
	   generateOrderId(0);
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println("AE is coming");
		   e.printStackTrace();
	   }
   }
	   
   
	public static void main(String[] args)
	{
		addToCart();
		System.out.println("bye");
	}

}
