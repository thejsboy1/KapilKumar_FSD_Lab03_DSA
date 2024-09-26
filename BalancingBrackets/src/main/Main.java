/**
 * 
 */
package main;

import com.gl.brackets.BracketsBalancer;
import com.gl.brackets.ReadData;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the Brackets Value here please
		//for Testing with Hard Coded Data
		//and please comment the ReadData and
		//its method readDataFrromConsole in,
		//this Main class
		String myBrackets = "";
		//myBrackets = "[<#|>]";		//Invalid Expression
		//myBrackets = "{[()]}";		//Valid Expression
		//myBrackets = "({[<>]})";		//Valid Expression
		//myBrackets = "[<<]";			//Invalid Expression
		//myBrackets = "[<>]]";			//Invalid Expression
		//myBrackets = "[<#|>]";		//Invalid Expression
		//myBrackets = "<[>]";			//Invalid Expression
		//myBrackets = "<{[()]}>";		//Valid Expression
		myBrackets = ReadData.readDataFromConsole();
		BracketsBalancer balancer = new BracketsBalancer(myBrackets);
		
		balancer.check();

	}

}
