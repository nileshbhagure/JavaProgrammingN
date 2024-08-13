package access.modifier1;
/*default- if no accessor speciifor metion by default is Default. no need to mention
 //same class we can access all properities

 * 
 * 
 */
public class Car 
{
   public String name;
   protected int price;
   private String color;
   int mileage;
   
	public static void main(String[] args) {
      Car c=new Car();
    
      //same class we can access all properities
      //within the same class all varaible we can access
      c.name="bmw";
      c.price=20;
      c.color="red";
      c.mileage=10;
	}

}
