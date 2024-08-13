package javasessions;
/*
 Array: Similiar Type of Data we can stored in a array
 limitation
   - stored only similiar type of data
   -size is fixed : static array to overcome this issue we have to use dymaic array: ArrayList
  used case of static array
    - booking tickt on bookmyshow fixed 80 sear
    -months/day 
    -fligh booking max seat are 180
    - 6 ball per over
    -when menu item are fixed on sites
    -when category are fixed eg bigbasket category
 */
public class ArrayConcept {

	public static void main(String[] args)
	{

	//array
	//1. int array
	//a. using new keyword
	// its mandtory to specify size
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
	System.out.println(i[0]);//10
	System.out.println(i[3]); //30
	//System.out.println(i[4]); // exception- ArrayindexoutofboundsException. we have array 4 & tried to access 4 element
	//System.out.println(i[-1]);// Arrayindexoutofboundexceptions	
	
	System.out.println(i.length);// 3 length of array
	
	System.out.println("--------------");
	
	int length=0;
	int len=i.length;
	int li=0;
	int hi=len-1;
	System.out.println("li =" + li);
	System.out.println("hi= " + hi);
	System.out.println("lngth= " +len);
	
	
	System.out.println("--------------");
	//to print all the values from array: iterate this array: for loop:
	for(int k=0; k<i.length; k++)
	{
		System.out.println(i[k]);   // k is index/pointer/counter starting with 0
	}
	
	System.out.println("----reverse order----------");
	// to print the array in reverse order:
	for(int p=i.length-1; p>=0; p--)
	{
		System.out.println(i[p]);
	}
	
	System.out.println(i[0]+i[1]); //10+20=30
	
	//2 double
	double d[]=new double[2]; //l=0 h-1
	d[0]=12.33;
	d[1]=23.44;
	System.out.println(d[0]); //12.33
	
	System.out.println("--------------");
	
	//3 char
	char c[]=new char[3]; //0-2
	c[0]='a';
	c[1]='b';
	c[2]='$';
	System.out.println(c[0]);//a
	System.out.println(c[0]+c[1]);// asc value 97+98= 195
	
	 //iteration char array
	System.out.println("--iteration/displaying char array-----------");
	for(int g=0; g<c.length; g++)
	{
		System.out.println(c[g]);
	}
		
	{
		
	}
	
	//System.out.println(c[0]); // default value of char is blank space so blank space with print in console
	
	System.out.println("--------------");
	/*int k[]=new int[5];
	//k[2]=20;
	System.out.println(k[0]);  //0 default value of integer 
	System.out.println(k[1]);  //1
	System.out.println(k[5]);// 20 if given specific value.. specific value with retreiew*/
	}

}
