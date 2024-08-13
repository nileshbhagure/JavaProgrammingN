package oop_encapsulation;

import java.util.ArrayList;

public class Users {
	String name;
	int age;
	ArrayList<String> devicelist;
	
	

	public Users(String name, int age, ArrayList<String> devicelist) {
		this.name = name;
		this.age = age;
		this.devicelist = devicelist;
	}



	public static void main(String[] args) {
		ArrayList<String> tomDeviceList=new ArrayList<String>();
		tomDeviceList.add("iphone12");
		tomDeviceList.add("macbook");
		tomDeviceList.add("samsung phone");
		
		Users u1=new Users("nil", 32, tomDeviceList);
		
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.devicelist);
		System.out.println(u1.devicelist.size());

	}

}	
