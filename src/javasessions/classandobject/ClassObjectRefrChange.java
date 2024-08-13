package javasessions.classandobject;

public class ClassObjectRefrChange
{
	String name;
	int age;
	String city;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ClassObjectRefrChange u1=new ClassObjectRefrChange();
		u1.name="Nilesh";
		u1.age=25;
		u1.city="Pune";
		
		ClassObjectRefrChange u2=new ClassObjectRefrChange();
		u2.name="harshada";
		u2.age=30;
		u2.city="kop";
		
		ClassObjectRefrChange u3=new ClassObjectRefrChange();
		u3.name="meet";
		u3.age=07;
		u3.city="nashik";
		
		System.out.println(u1.name + " "+u1.age+ " " +u1.city); //nil
		System.out.println(u2.name + " "+u2.age+ " " +u2.city);//har
		System.out.println(u3.name + " "+u3.age+ " " +u3.city);//meet
		
		u1=u2;  // Reference assignment from one ref to other fromu1 & u2 both pointing to u2 harshada
		
		System.out.println(u1.name + " "+u1.age+ " " +u1.city);  //hars
		System.out.println(u2.name + " "+u2.age+ " " +u2.city);  //hars
		System.out.println(u3.name + " "+u3.age+ " " +u3.city);  //meet
		
		u2=u3; //u2 & u3 both pointing to u3 meet
		System.out.println(u1.name + " "+u1.age+ " " +u1.city);  //hars
		System.out.println(u2.name + " "+u2.age+ " " +u2.city);  //meet
		System.out.println(u3.name + " "+u3.age+ " " +u3.city);  //har
		
		u3=u1; 
		System.out.println(u1.name + " "+u1.age+ " " +u1.city);  //hars
		System.out.println(u2.name + " "+u2.age+ " " +u2.city);  //meet
		System.out.println(u3.name + " "+u3.age+ " " +u3.city);  //har
		
		u1=u3;
		System.out.println(u1.name + " "+u1.age+ " " +u1.city);  //hars
		System.out.println(u2.name + " "+u2.age+ " " +u2.city);  //meet
		System.out.println(u3.name + " "+u3.age+ " " +u3.city);  //har
		
		
	}

}
