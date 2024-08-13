package stack.memory;
// Objects are stored in heap memory
//Reference are stored in Stack memory

/*whenever we call from A method to b & again B called to A it to print values but after some time it memory goes full & gives stackoverflow error
 *calling stack is mention where calling method is stores 
 *after execution deallocation of entry is done
 * memory allocation the memory block is done & then deallocation the memory block is done
 * 
 * Stack-LIFO last in first out
 * queue- First in first out
 * 
 *heap memory is more complex then Stack
 *
 *to run pgm in debug mode first double click on line where you want till debug & then run as Debug->java appls
 */


public class A {

	public static void main(String[] args) 
	{
	  System.out.println("A--Main");
       B.main(args);
	}

}
