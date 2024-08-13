package access.modifier1;

////same pkg non sub class we can access all properities except private(String color in Car class)

public class Truck {

	public static void main(String[] args) {

		Car c=new Car();
		c.mileage=10;
		c.name="brezza";
	}

}
