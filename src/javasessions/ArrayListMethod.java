package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethod {

	public static void main(String[] args) 
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(100);
		ar.add(1);
		ar.add(20);
		ar.add(19);
		
		Collections.sort(ar); //will sort arr into asc order
		System.out.println(ar);  // [1, 19, 20, 100]
		System.out.println("The min value "+ar.get(0));
		System.out.println("The max value "+ar.get(ar.size()-1));
	
		
		//to print arraylist in reverse order
		System.out.println("Array list in reverse order");
		Collections.sort(ar, Collections.reverseOrder());
		System.out.println(ar);
		
		//System.out.println(ar); //[100, 1,20, 19]
	
	/*  System.out.println("------Static array");
	  int arr[]= {1,2,3,4,5};
	//  System.out.println(arr);// it will print address of mememory location
	System.out.println(Arrays.toString(arr));*/
		
		ArrayList<String> emp=new ArrayList<String>();
		emp.add("nil");
		emp.add("hars");
		emp.add("meet");
		emp.add("viraj");
		emp.add("shambu");
		
		System.out.println(emp);
		
		// empty list
		//emp.clear(); // o/p= [] empty list
		//System.out.println(emp);
		
		
		//contains method check particular element present in list
		if(emp.contains("nil"))
		{
			System.out.println("Nil is present");
		}
	
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(2);
		ar1.add(13);
		ar1.add(220);
		ar1.add(119);
		System.out.println(ar1);
		
		//adding two ArrayList using addAll() method
		ar1.addAll(ar); 
		System.out.println(ar1);//[2, 13, 220, 119, 100, 1, 20, 19)
	
		ArrayList<String> names=new ArrayList<String>();
		names.add("nil");
		names.add("hars");
		names.add("meet");
		names.add("viraj");
		
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);
		
		System.out.println(names);
		
		//Collections is class in java with sort() method names will sorted alphabe
		Collections.sort(names); 
		System.out.println(names);
		
		//swap
		Collections.swap(names, 1, 2);
		System.out.println(names);
		
		
		
	}

}
