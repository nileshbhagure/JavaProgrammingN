package java.assignment;

import java.util.ArrayList;

//Search a restruarant
//by rest name- retrun 100
//by name & food item-return an ArrayList<String> with Rest name & food item
//by name food item and price
public class SearchARestrUsingMethodOverloading 
{

	/**
	 * @param name
	 * @return
	 */
	public int SearchRest(String name)
	{
	  	return 100;
	}
	
	public ArrayList<String>SearchRest(String name, String food_item)
	{
		ArrayList<String> ar=new ArrayList<String>();
		
		if(name.equals("rest1"))
		ar.add("pizza");
		ar.add("burger");
		return null;	
		
	}
	
	public static void main(String[] args) {
		SearchARestrUsingMethodOverloading obj=new SearchARestrUsingMethodOverloading();
		obj.SearchRest("rest1");
		obj.SearchRest("rest1", "burger");
		
	}

}
