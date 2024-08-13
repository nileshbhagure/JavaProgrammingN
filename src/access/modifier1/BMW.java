package access.modifier1;

public class BMW extends Car 
{

	public static void main(String[] args) 
	{
//same pkg sub class we can access all properities except private(String color in Car class)
	
       BMW b=new BMW();
       b.name="nil";
       b.mileage=20;
       b.price=10;
      // b.color='red';// we cannot access private members from subpkg same class
       
	}

}
