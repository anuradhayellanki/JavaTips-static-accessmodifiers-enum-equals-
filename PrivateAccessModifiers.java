package com.cashapona.javatips.jun24;
/*
 * import static import java.lang.System.out
 */
import static java.lang.System.out;
/**
 * @author Anuradha
 *
 */
class PrivateAccess{
	/* 
	 * private modifier access only with in the class
	 * we can access private variable in another class using setter and getter methods
	 */
	private String string;
	/**
	 * @return the String
	 */
	String getString() {
		return string;
	}
	/**
	 * @param String the String to set
	 */
	void setString(String string) {
		this.string = string;
	}
}
public class PrivateAccessModifiers {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrivateAccess privateAccess=new PrivateAccess();
		privateAccess.setString("Example of private access modifier");
		out.println("String  : "+privateAccess.getString());
	}
}
