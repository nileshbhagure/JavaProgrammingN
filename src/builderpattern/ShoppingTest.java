package builderpattern;

public class ShoppingTest {

	public static void main(String[] args) 
	{
		Ecomm u1=new Ecomm(); // only one object is created & call other same method
		/*u1.doLogin("nil", "nil123");
		u1.search("macbook");
	}*/
		
		//Uses builder pattern chain of process

		//builder pattern chain of methods
		u1.doLogin("nil@gmail.com", "nil123")
		          .search("mackbook")
		            .addtoCart("mackbook pro")
		              .makePayment("1234 1234 1234 1234", 123)
		                .generateOrder()
		                 .logout();
		
		u1.doLogin("nil@gmail.com", "nil123")
		   .addtoCart("Imac")
		     .generateOrder()
		       .logout();
		
		
		u1.doLogin("harshada@gmail.com", "har123")
		      .search("ipad")
		        .logout();
		
		
		u1.doLogin("meet@gmail.com", "meet123")
               .logout();
		
		u1.doLogin("viraj@.com", "viraj");

		       
		    

	}

}
