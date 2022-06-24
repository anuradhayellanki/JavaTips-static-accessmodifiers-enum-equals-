package com.cashapona.javatips.jun24;
/**
 * @author Anuradha
 *
 */
class Student{
	public int rollNo;
	String name;
	static String college=change();
	/*
	 * static method is used to change the value of static variable
	 * static method can only directly access static data
	 */
	static String change() {
		return college="SVECW";
	}
	/*
	 * constructor to initialize the variable
	 */
	Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	/*
	 * method to display values
	 */
	void display() {
		System.out.println(rollNo+" "+name+" "+college);
	}
}
public class StaticMethodAndStaticBlockRunner {
	/*
	 * static block executed before the main method at the time of class loading
	 */
	static {
		System.out.println("Static block is executed before main method");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student1=new Student(1,"Anuradha");
		Student student2=new Student(2,"Aadvik ram");
		Student student3=new Student(45,"Shree keerthana");
		/*
		 * calling display method
		 */
		student1.display();
		student2.display();
		student3.display();
	}
}
