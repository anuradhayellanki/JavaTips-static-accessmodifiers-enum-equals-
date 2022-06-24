package com.cashapona.javatips.jun24;
/**
 * @author Anuradha
 */
class staticVariable{
	/*
	 * static variable gets memory only once 
	 */
	static int count=1;
	staticVariable(){
		count++;
		System.out.println("Count : "+count);
	}
}
public class StaticVariableRunner {
	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * creating objects for staticVariable
		 */
		staticVariable s1=new staticVariable();
		System.out.println("First object created : ");
		staticVariable s2=new staticVariable();
		System.out.println("Second object created : ");
		staticVariable s3=new staticVariable();
		System.out.println("Third object created : ");
	}
}
	