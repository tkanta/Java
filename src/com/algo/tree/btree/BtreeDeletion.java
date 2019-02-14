package com.algo.tree.btree;

import java.util.LinkedList;
import java.util.Queue;

public class BtreeDeletion {
		
	static class Node<T>{
		
		T key;
		Node<T> left, right;
		
		Node(T val){
			this.key = val;
			this.left = null;
			this.right = null;
		}
	}
	
	
	public static void inOrder(Node<Integer> node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.key+"  ");
		inOrder(node.right);
	}
	
	public static void deleteNode(Node<Integer> temp, Integer key) {
		Queue<Node<Integer>> queue = new LinkedList<>();
		queue.add(temp);
		Node<Integer> keyNode = null;
		Node<Integer> tempParent = null;
		
		while(!queue.isEmpty()) {
			temp = queue.peek();
			queue.remove();
			
			if(temp.key == key) {
				keyNode = temp;
			}
			
			if(null != temp.left) {
				queue.add(temp.left);
			}
			
			if(null != temp.right) {
				queue.add(temp.right);
				tempParent = temp;
			}
		}
		
		keyNode.key = temp.key;
		temp = null;
		tempParent.right = null;
		
	}
	
	public static void main(String[] args) {
		Node<Integer> root = new Node<>(10); 
	    root.left = new Node<Integer>(11); 
	    root.left.left = new Node<>(7); 
	    root.left.right = new Node<>(12); 
	    root.right = new Node<>(9); 
	    root.right.left = new Node<>(15); 
	    root.right.right = new Node<>(8); 
	  
	    System.out.println("Inorder traversal before deletion : "); 
	    inOrder(root); 
	  
	    int key = 11; 
	    deleteNode(root, key); 
	    
	    System.out.println();
	    System.out.println("Inorder traversal after deletion : "); 
	    inOrder(root);
	}
}
