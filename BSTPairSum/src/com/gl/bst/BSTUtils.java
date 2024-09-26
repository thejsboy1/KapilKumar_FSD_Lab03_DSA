/**
 * 
 */
package com.gl.bst;

import java.util.Scanner;

/**
 * 
 */
public class BSTUtils {

	public static BinarySearchTree sampleBST() {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		
		//Used this Data for Testing Purpose
		/*		
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(30);
		bst.insert(60);
		bst.insert(80);
		bst.insert(100);
		bst.insert(20);
		bst.insert(40);
		*/
		

		
		Scanner scr = new Scanner(System.in);
		Integer nodeValue = 0;
		Integer no_of_elements = 0;
		
		while((no_of_elements == 0) || (no_of_elements == 1) || (no_of_elements == 2))
		{
			System.out.println("No of elements should be >= 3");
			System.out.println("Please enter the no of elements in the Binary Search Tree:");
			no_of_elements = scr.nextInt();
		}
		
		
		for(int i = 1; i <= no_of_elements; i++)
		{
			System.out.printf("Enter [%d] element:\n", i);
			nodeValue = scr.nextInt();
			bst.insert(nodeValue);
		}
		
		// Scanner Input is getting only one Instance
		// So commenting out the close method
		//scr.close();
		
		return bst;
	}
}