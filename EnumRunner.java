package com.cashapona.javatips.jun24;
import static java.lang.System.out;
/**
 * @author Anuradha
 * EnumRunner class is the demonstration of enum
 * enum is a data type which contains fixed set of constants
 */
enum Season{
	/*
	 * all constants in enum are capital letters 
	 * enum contains variables, methods and constructors
	 */
	SUMMER(1), WINTER(3), RAINY(2), AUTUMN(4);
	private int value;
	private Season(int value) {
		this.value=value;
	}
	public int getValue() {
		return value;
	}
}
public class EnumRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Season season1=Season.valueOf("SUMMER");
		out.println(season1);
		/*
		 * ordinal(), prints the index position of the specified constant
		 */
		out.println(Season.SUMMER.ordinal());
		for(Season seasons:Season.values()) {
			int i=seasons.ordinal();
			out.println(i+" "+seasons.toString());
		}
	}
}
