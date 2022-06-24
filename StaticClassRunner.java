package com.cashapona.javatips.jun24;
/**
 * @author Anuradha
 * program to demonistrate the static keyword with classes
 */
public class StaticClassRunner {
	private static String string="I Love India";
	int i;
	/*
	 * one class with in another class is known as innner class
	 */
	class InnerClass{
		void print() {
			i=23;
			System.out.println("InnerClass nested class");
			System.out.println(string);
		}
	}
	/*
	 * A class can be made static only if it is a nested class
	 * 
	 * We cannot declare a top-level class with a static modifier but can declare nested classes as static
	 */
	static class NestedClass{
		public void display() {
			//it can access only static variables
			//i=9;
			System.out.println("Static nested class");
			System.out.println(string);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * can't create instance for inner class
		 */
		//InnerClass innerClass=new InnerClass();
		StaticClassRunner staticClassRunner=new StaticClassRunner();
		InnerClass innerClass=staticClassRunner.new InnerClass();
		innerClass.print();
		/*
		 * can create instance for static nested class
		 */
		NestedClass nestedClass=new NestedClass();
		nestedClass.display();
	}

}
