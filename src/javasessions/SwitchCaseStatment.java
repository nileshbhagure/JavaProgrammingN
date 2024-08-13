package javasessions;


//Switch will not go line by check directly check jump to conditions
//break can only be used with switch & for
//Switch cond will only be used with int[byte,short] & string  not be used with boolean, double other data type     
class SwitchCaseStatment
{

	public static void main(String[] args) 
	{
	

		 //take browser value..ch/ff/i.e/safari
	      // if the condition is matched..launch browser
	      // else print a msg: please pass the right browser
		String browser="chrome";
		switch (browser) 
		{
		case "chrome":
			System.out.println("launch chrome");
			
			break;
		case "firefox":
			System.out.println("launch firefox");
			
			break;
		case "safari":
			System.out.println("launch safari");
			
			break;
		case "edge":
			System.out.println("launch edge");
			
			break;
		default:
			System.out.println("Please pass correct browser " +browser);
			break;
		}
		
		//switch case usage eg
		//mutiple env: QA/DEV/UAT/STAG/PROD
		//cross browser logic
		//locator
		
		
	
		

	}

}
