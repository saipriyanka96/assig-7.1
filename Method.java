package different;
//package is a grouping of related types providing access
//protection and name space management.
//different is a package name.
import java.io.IOException;
import java.util.*;
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//Signals that an I/O exception of some sort has occurred. This class is the general class of exceptions produced by failed or interrupted I/O operations. 
//java.util.* contains the collections framework,legacy collection classes,event model,date and time facilities and other miscellaneous utility classes
public class Method 
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
	//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
	//Method is class name. Java is case in-sensitive which means identifier Hello and hello would different meaning in Java	
{
		private static String name="wings of fire";
	//private modifier specifies that the member can only be acceses in its own class
	//static used to prepare a field,method or inner classes as a class field.
	//String is sequence of character	
		private int costprice=350;
	//int holds the numbers
	public void accept() throws IOException {
	//accept gives connect between the client and server.
	//throws statement throws an exception.
		//here creating main method which throws an exception
		// TODO Auto-generated method stub
		System.out.println("book name is:"+name);
		//prints the statements
		System.out.println("cost price is:"+costprice);
	}

}
