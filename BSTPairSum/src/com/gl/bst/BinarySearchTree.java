/**
 * 
 */
package com.gl.bst;

/**
 * 
 */
public class BinarySearchTree {

	Node root;
	
	public Node getRoot() {
		return root;
	}
	
	void insert(int value) {
		
		// Root is NULL
			// Create the new-node
			// Make root to point to new-node
		
		// Root is NOT Null
			
			// Create the new-node
			// Call the constructNodeDetails
			
			// Set the relationship between parent-node and the new-node
			// Left - Child / Right-Child
			

		Node newNode = new Node(value);

		if (root == null) {
			root = newNode;
		}else {
			
			NodeInsertionDetails nodeDetails 
				= constructNodeDetails(value);
			
			Node parentNode = nodeDetails.getParentNode();
			
			// LEFT / RIGHT
			String direction = nodeDetails.getDirection();
			
			if (direction.equals("LEFT")) {
				
				parentNode.setLeft(newNode);
			}else if (direction.equals("RIGHT")) {
				parentNode.setRight(newNode);
			}
		}
		
	}
	
	// 
	NodeInsertionDetails constructNodeDetails(Integer data){
		
		NodeInsertionDetails nid = new NodeInsertionDetails();
		
		traverseTree(root, data, nid);
		
		return nid;
	}
	
	void traverseTree(Node aNode, Integer data, 
			NodeInsertionDetails details){
	
		// Compare [data and aNode.data]
		
		// if data <= aNode.data
			// aNode.left IS NULL	
				// Located the ParentNode
				// Direction - LEFT
			// traverseTree(aNode.left)
		// if data > aNode.data
			// NUll check aNode.right
				// aNode.right -> Parent
				// Direction - RIght
			// traverseTree(aNode.right)
		
		if (data <= aNode.getData()) {
			
			Node leftNode = aNode.getLeft();
			
			if (leftNode != null) {
				traverseTree(leftNode, data, details);
			}else {
				details.setParentNode(aNode);
				details.setDirection("LEFT");
			}			
		}else {
			
			Node rightNode = aNode.getRight();
			
			if (rightNode != null) {
				traverseTree(rightNode, data, details);
			}else {
				
				details.setParentNode(aNode);
				details.setDirection("RIGHT");
			}
		}
	}
	
}
