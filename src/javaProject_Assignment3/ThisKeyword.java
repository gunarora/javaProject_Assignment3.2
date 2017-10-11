package javaProject_Assignment3; //Package declaration is mandatory

/*Write a program in Java to show the use of super and this keyword with a constructor, methods,
variables*/

/*This assignment will help you to master in Super and this keyword in java.*/

//use of this keyword class 
//within same class this() keyword use
public class ThisKeyword {
	//Declaring variables
	int Id;     
	String name;  
	
	//Default Constructor
	ThisKeyword()
	{
		System.out.println("hello Emp");
	}  
	//Parameterized Constructor
	ThisKeyword(int Id,String name){  
		//using this keyword in constructor
		this(); //it will call default constructor
		this.Id=Id;  
		this.name=name;  
		System.out.println("Constructors value: "+Id+" "+name);
		} 
	
	//method to display
	void display(){
		System.out.println(Id+" "+name);  
	} 
	
	//method to use this and call another method
		void newdDisplay() {
			System.out.println("hello new method");
		//using this keyword in Method
		this.display();
		}

//main started
	public static void main(String[] args) {
		//Calling to display current class Variables
		//ThisKeyword e1=new ThisKeyword();   
				//e1.newdDisplay();
		//obj of class with parameters firstly call default constructor because of this keyword in parameterized constructor
		//this: to refer current class instance variable
				ThisKeyword s1=new ThisKeyword(111,"xy");
				ThisKeyword s2=new ThisKeyword(112,"yz");  
				
				//calling method
				s1.display();  
				s2.display();
				//call display() as using this in that.
				s1.newdDisplay();
	}

}
