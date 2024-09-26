/**
 * 
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

import com.gl.bst.BSTPairFinder;
import com.gl.bst.BSTUtils;
import com.gl.bst.BinarySearchTree;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		com.gl.bst.BinarySearchTree bst = com.gl.bst.BSTUtils.sampleBST();

		InputStreamReader in = new InputStreamReader(System.in);
		
		Integer pair_sum = 0;

		System.out.println("Please enter the value for Pair Sum:");

		BufferedReader br = new BufferedReader(in);
		
		try {
			String myval = br.readLine();
			pair_sum = Integer.parseInt(myval);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		com.gl.bst.BSTPairFinder pairFinder = 
			new com.gl.bst.BSTPairFinder(bst, pair_sum);
		
		
		pairFinder.findPairs();
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
