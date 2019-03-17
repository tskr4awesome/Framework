package datatype;

public class VariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean status ;//declaration part
		status = true;//Initialization
		boolean nstatus =  true;
		System.out.println("My own Status was " +status);
		System.out.println("My new Status is "+nstatus);
	
	
	    char s = 'm';
	    System.out.println("First Char Value is " +s);
	
	//character works on unique code
	   char c =65;
	   System.out.println(c);
	   //type casting -- down and upcasting 
	   //converting from 8 bytes to 4 bytes -down casting
	   //converting from lower datatype to higher data type -upcasting 
	     
	   byte marks = 98;
	   System.out.println("My marks are "+marks);
	   
	   float my_marks = (float)89.89;
	   float my_rt = 89.89f;
			   System.out.println(my_marks);
	   System.out.println(my_rt);
	   
	   
	   //local variable -- contains garbage value
	   //global variable -- contains null/default values
	   
	}

}
