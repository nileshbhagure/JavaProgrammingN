package javasessions;

//conditoperator > < >= <= ==
//every if stmt no need else stmt
// break cannot be used with if stmt
public class ConditionalOperator {

	public static void main(String[] args) {

		int i = 20;
		int j = 10;

		if (i >= j) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		// Dead code- The code which never going to execute
		// if declare conditon true/false then the other condition may not be exectute
		if (true) {
			System.out.println("Selenium");

		} else {
			System.out.println("Cypress");
		}

		// To avoid dead code
		boolean flag = true;
		if (flag) {
			System.out.println("Testing with selenium");
		} else {
			System.out.println("Testing with cypress");
		}

		// nested if
		int total = 92;
		if (total <= 100) {
			System.out.println("PASS");
			if (total >= 90) {
				System.out.println("A Grade");
				if (total >= 95) {
					System.out.println("100 discount");

				} else {
					System.out.println("70% discount");
				}
			}

			else {
				System.out.println("B grade");
			}

		} else {
			System.out.println("Invalid marks");
		}

		// take browser value..ch/ff/i.e/safari
		// if the condition is matched..launch browser
		// not the correct way to write pgm to avoid this used if else if
//		String browser="safari";
//		if(browser.equals("chrome")) {
//			System.out.println("launch the chrome");
//			
//		}
//		if(browser.equals("firefox")){
//			System.out.println("launch the Firefox");
//			
//		}
//		if(browser.equals("safari")){
//			System.out.println("launch the safari");
//		}
		// below else conditon if of safari case
//		else {
//			System.out.println("please pass the right browser... " +browser);
//		}
//		

		// if-else if:
		// take browser value..ch/ff/i.e/safari
		// if the condition is matched..launch browser
		// else print a msg: please pass the right browser

		String browserName = "ff";

		if (browserName.equals("chrome")) {
			System.out.println("Launch chrome");
		}

		else if (browserName.equals("safari")) {
			System.out.println("Launch safari");
		}

		else if (browserName.equals("ff")) {
			System.out.println("Launch firefox");
		}

		else {
			System.out.println("please pass right browser... " + browserName);
		}

		//above pgm check each & every conditions which casues performance issues so to avoid this use switch case
		
	}
}
