/**
 * 
 */
package com.gl.brackets;

/**
 * 
 */
public class ReadData {

	
	public static String readDataFromConsole()
	{
		java.util.Scanner scr = new java.util.Scanner(System.in);
		
		System.out.println("Please Enter the Data Containing the Brackets:=");
		String myBrackets = "";
		
		myBrackets = scr.nextLine();
		
		scr.close();
		
		return myBrackets;

	}
}
