package access.modifier2;
/*Protected: Different package sub class- YES
 * default-Different package sub class- No
 * 
 * 
 */

import access.modifier1.Car;

public class Honda extends Car {

	public static void main(String[] args) {
//Protected: Different package sub class we can access
//so only name & price we can access from car class
		Honda h=new Honda();
		h.name="tata";
		h.price=10;
		
		
	}

}
