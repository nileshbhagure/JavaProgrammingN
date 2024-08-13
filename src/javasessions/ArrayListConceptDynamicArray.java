package javasessions;
import java.util.ArrayList;

/*
 * In order to overcome static array we have dynamic array
 * ArrayList- Default class is java
 * maintain the index/order
 * 
 */
public class ArrayListConceptDynamicArray {

	public static void main(String[] args)
	{
		//create the object of the ArrayList: with new keyword
		ArrayList ar=new ArrayList();// empty array list, by default 10 size is allocated by java
		//PC(physical capacity=0
		//VC(virtual capacity= 10
		System.out.println(ar.size());// VC=0
		
		ar.add(100); // index 0th position
		ar.add(200); // index 1th postion
		
		//.size() method give size of array used in dynamic array while in static array .length() method is used
		//PC capacity is return after adding/del element
		System.out.println(ar.size()); //2 current size of array
  
		ar.add(300); //2
		ar.add(400);//3
		
		System.out.println(ar.size()); //4
		

		ar.add(500); //4
		ar.add(600);//5
		
		System.out.println(ar.size()); //6
		//once array size is pc is full=10 then java allocat new memory pc=10/2=5 so 5 new memory allocation is created
		//also check current current PC & then it will divide by 2 & then allocate

		//to fetch data from array- get() method is used
		System.out.println("-----Printing value from arraylist-------");
		System.out.println(ar.get(0));   //100
	    //System.out.println(ar.get(6));//IOB IndexOutOfBoundsException- No value available on phys capacity of 6th location
	   //System.out.println(ar.get(-1));//IOB
		
		//to print all values of arraylist: for loop for each loop
		System.out.println("print all arraylist by for loop ");
	  
		for(int i=0;i<ar.size(); i++)    //length() method will be use for static array, size() method will be used for dynamic array
	    {
	      System.out.println(ar.get(i)); //100 200 300 400 500 600
	    }
	
		
	
	}

}
