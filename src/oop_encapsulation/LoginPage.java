package oop_encapsulation;

public class LoginPage 
{
private String userName;
private String password;

//constructor
public LoginPage(String userName, String password) {
	this.userName = userName;
	this.password = password;
}

//getter/setter
public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

//Ensuplation is achieved - private variable is access with public layer 
public void doLogin()
{
	System.out.println("Enter username:"+userName);
	System.out.println("Enter password:"+password);
	System.out.println("click on login");
	System.out.println("user is login in");
	
}


}
