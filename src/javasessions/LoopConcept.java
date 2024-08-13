package javasessions;

/*Types of loop
/4 types

break- break the entires conditions

*/
 
public class LoopConcept
{

	public static void main(String[] args) 
	{
		//1 to 100;
		//1.While loop
		
		int i=1;
		while(i<=10)
		{
			System.out.println(i); // 1 2 3 4 5 6 7 8 9 10
			//i++;
			//++i;
			i=i+1;
		}
	
		// 1 to 10: 0 2 4 6 8 10- even no
		int e=0;
		while(e<=10)
		{
			System.out.println(e);  // 0 2 4 6 8 10
			e=e+2;
		}
		
	 System.out.println("---------------");
	 
	 //Infinite loop
	 while(true) 
	 {
	   System.out.println("----Welcome to Shirdi------");	 
	      break; 
	 }
		
	 System.out.println("---------------");
	 //1 to 100;
	 //mutiplication of 5--> print hi...
	 int k=1;
	 while(k<=100)
	 {
		 System.out.println(k);
		 if(k%5==0)
		 {
			 System.out.println("hi...");
		 }
		 if(k==50)
		 {
			 System.out.println("half century..");
		       //break
		 }
		 if(k==100)
		 {
			 System.out.println("century..");
			//break
		 }
		 
		 k++;
	 }
// uses case of while
//when no of iterations are not fixed
//page loading time
//no of web elements on the page changes 10 20 40 50
//web table pagination-> 1 2 3 4 5 7..next
	 System.out.println("----------");
	 //2 for loop
	 // 3 stmt: initally, conditional, incre/dec
	 // the movement the condition is satisfied it will come & print & later do increm/dec
	 // 1 to 10:
	 for(int t=1; t<=10; t++)
	 {
		 System.out.println(t); //1 2 3 4 5 6 7 8 9 10
            if(t==5)
            {
            	break;
            }
	 }
	 
	 
	 //without any condition it will alwyas  put try & goes into infinite loop
		/*
		 * for(;;) { System.out.println("bye"); break; }
		 */

	 for(byte b=1; b<=10; b++)
	 {
		 System.out.println(b);
	 }
	 
	 
	 //with double
	 for(double b=1.0; b<10; b++)
	 {
		 System.out.println(b);
	 }
	 
	 //with char
	 for(char c='a'; c<='z'; c++)
	 {
		 System.out.println(c+ ":"+(int)c);
	 }
	 
System.out.println("------------------");	
	
	//use case of for loop
	//when no of iterations are fixed
	//fixed "element avaible of

	//3. do while loop
	//do all stmt will at least execute onces then check conditions
	/*Use case of do while loop
	 * web table pagination- i
	 * 
	 */
	//1 to 10;
	int p=1;
	do {
		System.out.println(p);
		p++;
	}
    while(p<=10); 
	
	System.out.println("----------");

	//10 to 1;
	int rowcount= 10;
	while(rowcount>=0)
	{
		System.out.println(rowcount);
		rowcount--;
	}

	//4. for each loop
}
	
}

