package javaProject_Assignment3; //Package declaration is mandatory

/*Write a program in Java to show the use of super and this keyword with a constructor, methods,
variables*/
/*This assignment will help you to master in Super and this keyword in java.*/
//use of super class 
//Employee class

public class Emp {
	
	public static void main(String[] args) {
		FType obj = new FType();
		obj.printtype();

	}

}

//Base Class
class Person{
	//Declare variable
	String type = "Male";

	//Default Constructor
	Person()
	{	 
		System.out.println("This is Super Class");
	}
	//Super using Method
	void eat(){
		System.out.println("eating...");
		} 
}

//Derived class inherited by Person class
class FType extends Person
{
	String type = "Female";
	//Default Constructor
	FType()
	{
		//Calling constructor of base class using super keyword
		super();
		System.out.println("This is derived Class");
	}
	void eat(){
		System.out.println("eating bread...");
		}
	void printtype(){  
		//Calling Instance Variable
		System.out.println("Ftype is :" + type);//prints type of FType class
		//Calling Instance Variable of base class using Super keyword
		System.out.println(super.type);//print type of person class
		//Calling method 
		eat();
		//Calling method of base class using super keyword
		super.eat(); 
		} 
	
}
