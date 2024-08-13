package javasessions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) 
	{
		
  ArrayList<Integer> marksList=new ArrayList<Integer>();
   System.out.println(marksList.size()); //0
  
   marksList.add(100);//0
   marksList.add(200);//1
   marksList.add(11);//2
   marksList.add(20);//3

   System.out.println(marksList.get(2)); //11
   marksList.remove(2); // 11 will be removed from Arraylist
   System.out.println(marksList.get(2)); //O/P 20 because 11 will be remove & 20 will be shifted to up
	
   marksList.add(400);
   System.out.println(marksList.get(3)); //400 will be printed
	
   marksList.add(0, 150); // add particular element to particular index
   System.out.println(marksList.get(0)); //150
	
  // marksList.add(7, 700);
  // System.out.println(marksList.get(7));//IOB- because always follow sequence-continous memory allocation

   System.out.println("----to print with index");
   for(int i=0; i<marksList.size(); i++)
   {
	   System.out.println(i+ ":"+marksList.get(i));
	   
   }
   
	}

}
