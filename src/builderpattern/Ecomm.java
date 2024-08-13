package builderpattern;
/*
 * builder pattern: 
 * - Every method should return current class object using THIS keyword
 *  -builder pattern used for chain of methods
 *  - code looks clean
 *  - only one object is created in heap & call other same method
 * 
 * disadv
 *  
 */


public class Ecomm
{
	
public Ecomm doLogin()
{
	System.out.println("login into app ");
	return this;  //return current class object so we should write Class
}

public Ecomm doLogin(String un, String pwd)
{
	System.out.println("login into app " +un + " " +pwd);
	return this;
}

public Ecomm search()
{
	System.out.println("search with all prod names ");
	return this;
}

public Ecomm search(String name)
{
	System.out.println("search with : " + name);
	return this;
}

public Ecomm addtoCart(String name)
{
	System.out.println("add to cart: "+ name);
	return this;
}

public Ecomm makePayment(String cvv, int otp)
{
	System.out.println("make payment " +cvv+ "" +otp);
	return this;
}
public Ecomm makePayment(String cc, int cvv, int otp)
{
	System.out.println("make payment "+cc+ " "+cvv+ ""+otp);
	return this;
}

public Ecomm makePayment(String upi)
{
	System.out.println("make payment: "+upi);
	return this;
}

public Ecomm generateOrder()
{
	System.out.println("your order id is"+1234 );
	return this;
}

public Ecomm logout()
{
	System.out.println("logout suceesfully");
	return this;
}

}
