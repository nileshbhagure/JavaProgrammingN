package oop_Inheritance_MutipleInteritance.InterfaceConcept;
/*Multiple Interface: Interface
  - not supported in java but we can achieved using Interface 
  - to solve the diamond problem we need to used interface
  - Diamond problem- child class is trying to have multiple parent classes- Multiple inheritance
  - Interface does not have bussiness logic
  - Interface contain only abstract method/variables
  - we can have common/same method in interfaces
  -If interface has common method child class need to overrides only onces
  -whenever you are updating interface method the child class need to overrides those methods(mandtory)
  -we cannot create object of interface(as busineess logic is not written so java has restricted)
  -Final method cannot be overridden
  -Interface cannot have any parent class
  - By default method in interface are abstract in nature
  -In interface method cannot be static as we need to overides all the interface methods & if declare method static we can overides 
  
  - class to interface-> implements
  -class to class-> extends
  -interface to interface->extends
*/

//Fortisclass has 4 parent
public class FortisHospital extends Medical implements USMedical, UKMedical,IndianMedical
{
   //US
	@Override
	public void pediServices() {
     System.out.println("fortis--pediservices");		
	}

	@Override
	public void physioServices() {
		 System.out.println("fortis--physioServices");		
		
	}

	@Override
	public void orthoServices() {
		 System.out.println("fortis--orthoServices");		
		
	}

	
	//UK
	@Override
	public void ENTServices() {
		 System.out.println("fortis--orthoServices");		
		
	}

	@Override
	public void cardioServices() {
		 System.out.println("fortis--cardioServices");		
		
	}

	//India
	@Override
	public void oncologyServices() {
		 System.out.println("fortis--oncologyServices");		
		
	}

	@Override
	public void neuroServices() {
		 System.out.println("fortis--neuroServices");		
		
	}


	//individual method of fortis hosp
	public void pathologyServices()
	{
		System.out.println("forthis--pathologyServices");
	
	}
	public void OPDServices()
	{
		System.out.println("forthis--OPDServices");
	
	}

	
	//commonly interface method added in all 3 interface but need to override onces. If interface has common method child class need to overrides only onces
	@Override
	public void emergencyServices() {
		System.out.println("forthis emergency services");
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	//WHO grand parent interface
	@Override
	public void covid19News() {
		System.out.println("fortis covid19News");
		
	}

	@Override
	public void covid19Vacations() {
		System.out.println("fortis covid19vacations");
		
	}
	
	
	//Method Overloading & Method Overridding together


	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dentalServices(int dentists) 
	{
		
	}

	@Override
	public int dentalServices(int dentists, String dentalMachine) {
             return 100;		
	}
	
	
	//Static method cannot be overridden
	//Method hidding: when you have static method in parent class & child class also you have same static method
	public static void medicalTraining() {
    	System.out.println("Fortis Medicial Training");
    	
    }
	
    //can we override default method from interface: YES
    @Override
	public void donation()
    {
   	 System.out.println("Fortis medicial donations");
    }
    

}

