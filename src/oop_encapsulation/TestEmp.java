package oop_encapsulation;

public class TestEmp {

	public static void main(String[] args) 
	{
	
	/*{
		Employee e1=new Employee();
		e1.setName("Nilesh");   //set the name setter method
		e1.setAge(32);
		e1.setPerm(true);
		
		System.out.println(e1.getName());  //get the name
		System.out.println(e1.getAge());
		System.out.println(e1.isPerm());
	}*/


	//calling the employee class constructor
	//CRUD- Post- Create call
	Employee e1=new Employee("Nilesh", 32, true);

	//GET- Retrieve
	System.out.println(e1.getName());  //get the name
	System.out.println(e1.getAge());
	System.out.println(e1.isPerm());
	
	//for updating the value we used the set
	//put-update
	e1.setAge(33); 
	
	//GET
	System.out.println(e1.getName());  //get the name
	System.out.println(e1.getAge());
	System.out.println(e1.isPerm());
	
	e1.setPerm(false);
	System.out.println(e1.getName());  //get the name
	System.out.println(e1.getAge());
	System.out.println(e1.isPerm());
	}
	
}

