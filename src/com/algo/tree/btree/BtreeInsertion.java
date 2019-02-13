package com.algo.tree.btree;

import java.util.LinkedList;
import java.util.Queue;

public class BtreeInsertion {
	
	
	static class Node{
		int value;
		Node left, right;
		
		Node(int val){
			this.value = val;
			this.left = null;
			this.right = null;
		}
	}
	
	static Node root;
	//static Node temp = root;
	
	/**
	 * In order traversal
	 * @param temp
	 */
	static void inOrder(Node temp) {
		if(temp == null) {
			return;
		}
		inOrder(temp.left);
		System.out.print(temp.value+" ");
		inOrder(temp.right);
	}
	
	static void insertValue(Node temp, int val) {
		Queue<Node> tempQueue = new LinkedList<>();
		tempQueue.add(temp);
		
		while(!tempQueue.isEmpty()) {
			temp = tempQueue.peek();
			tempQueue.remove();
			
			if(temp.left == null) {
				temp.left = new Node(val);
				break;
			}else {
				tempQueue.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new Node(val);
				break;
			}else {
				tempQueue.add(temp.right);
			}
			
		}
	}
	
	public static void main(String[] args) {
		root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
       
        System.out.print( "Inorder traversal before insertion:"); 
        inOrder(root); 
       
        int key = 12; 
        insertValue(root, key); 
       
        System.out.print("\nInorder traversal after insertion:"); 
        inOrder(root); 
	}
	
	
}
