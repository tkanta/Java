package com.datastructure.tree.btree;

import java.util.LinkedList;
import java.util.Queue;

public class BtreeInsertion {
	
	
	static class Node<T>{
		T value;
		Node<T> left, right;
		
		Node(T val){
			this.value = val;
			this.left = null;
			this.right = null;
		}
	}
	
	static Node<Integer> root;
	//static Node temp = root;
	
	/**
	 * In order traversal
	 * @param temp
	 */
	static void inOrder(Node<Integer> temp) {
		if(temp == null) {
			return;
		}
		inOrder(temp.left);
		System.out.print(temp.value+" ");
		inOrder(temp.right);
	}
	
	static void insertValue(Node<Integer> temp, int val) {
		Queue<Node<Integer>> tempQueue = new LinkedList<>();
		tempQueue.add(temp);
		
		while(!tempQueue.isEmpty()) {
			temp = tempQueue.peek();
			tempQueue.remove();
			
			if(temp.left == null) {
				temp.left = new Node<Integer>(val);
				break;
			}else {
				tempQueue.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new Node<Integer>(val);
				break;
			}else {
				tempQueue.add(temp.right);
			}
			
		}
	}
	
	public static void main(String[] args) {
		root = new Node<Integer>(10); 
        root.left = new Node<Integer>(11); 
        root.left.left = new Node<Integer>(7); 
        root.right = new Node<Integer>(9); 
        root.right.left = new Node<Integer>(15); 
        root.right.right = new Node<Integer>(8); 
       
        System.out.print( "Inorder traversal before insertion:"); 
        inOrder(root); 
       
        int key = 12; 
        insertValue(root, key); 
       
        System.out.print("\nInorder traversal after insertion:"); 
        inOrder(root); 
	}
	
	
}
