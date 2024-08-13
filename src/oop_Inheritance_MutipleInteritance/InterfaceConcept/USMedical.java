package oop_Inheritance_MutipleInteritance.InterfaceConcept;

public interface USMedical extends WHO
{   
	//vars are static and final by default
	int min_free=10;
	
	
   //abstract method: having no method body: method prototype/only method declaration
   //cannot create object of interface
  //100% abstraction
	public void pediServices();
    public void physioServices();
    public void orthoServices();
    public void emergencyServices();  //commonly added in all 3 interface but need to override onces
   
    //overloading
    public void dentalServices();
    public void dentalServices(int dentists);
    public int dentalServices(int dentists, String dentalMachine);
    
    //after jdk 1.8 two major changes happened
    
    //1. we can have a static method with method body
    public static void medicalTraining() {
    	System.out.println("US Medicial Training");
    }
    
    //2. can have a default method
     //with the default keyword we can method with method body
    // The default method from interface can be override by child class

    default void donation()
     {
     	System.out.println("US Medicial donation");

     }
     
 
     
    
}
