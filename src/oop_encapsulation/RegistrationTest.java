package oop_encapsulation;

public class RegistrationTest {

	public static void main(String[] args) 
	{
		//reg page
		Registration reg=new Registration("Nilesh","nil@gmail.com");
		
		//go to profile page
		System.out.println(reg.getFirstName()+" "+reg.getEmail());  //Nilesh nil@gmail.com
        System.out.println(reg.getLastName()+" "+ reg.getPhoneNumber()+" "+reg.getPassword());
	
        //profile page: update the info
        reg.setLastName("Bhagure");
        reg.setPassword("admin123");
        reg.setPhoneNumber("9890123433");
        
        //go to profile page
        System.out.println(reg.getFirstName()+" "+reg.getEmail());
        
        System.out.println(reg.getLastName()+" "+reg.getPhoneNumber()+""+reg.getPassword());
        
	
	}

}
