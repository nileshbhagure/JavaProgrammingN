package oop_Inheritance_MutipleInteritance.InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.orthoServices();
		fh.pathologyServices();
		
		//
		fh.medicialReasearch();
		fh.medicialPublishNews();
		
		
		//calling interface variable with interface name.variable name or class name.variable
		System.out.println(USMedical.min_free);
		
		//calling interface variable with class name.variable name
		System.out.println(FortisHospital.min_free);
		
		//we cannot change it value as it final 
		//USMedical.min_free=25;
		
		
		//calling static method from interface with interface name .method name
		USMedical.medicalTraining();
		
		//calling with child class name
		FortisHospital.medicalTraining();
		
				
		
		//top casting:
		//child class object can be referred by parent interface ref variable
		// All the method from USMedi interface can be called
	    //when we try to access other interface method then referenece type check will be failed
		USMedical us =new FortisHospital();
	     us.pediServices();
	     us.physioServices();
	     us.emergencyServices();
	     us.orthoServices();
	     
	     //down casting- not allowed as we dont create object of interface
	     //FortisHospital fs=new USMedical();
	}

}
