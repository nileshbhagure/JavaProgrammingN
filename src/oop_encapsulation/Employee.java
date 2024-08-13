package oop_encapsulation;

/*encapusulation
 * -is a process of wrapping code and data together into a single unit,
  -Internal things are hidden not access 
  -creating public layer & then accessing private members
  -by creating getter(get the data) & setter(set the data)
  -getter&setter will come into picture only for private data memebers
  
  -eg- ATM- internal process is hidden
     -computer motherboard-does not internal structure do
     - POM- page object model class is eg
 
 */

public class Employee {
	// class variable
	private String name;
	private int age;
	private boolean isPerm;

	// constructor
	public Employee(String name, int age, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.isPerm = isPerm;
	}

	// getter and setter
	// for each variable we need to create one getter one setter
	// shortcut- right click source-Generate Getters & Setters

	public String getName() { // get data
		return name;
	}

	public void setName(String name) { // set data
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isPerm() {
		return isPerm;
	}

	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}

}
