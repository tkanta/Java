package com.algo.tree.bsearchtree;

public class InsertBSearchTree<T extends Number> {
	
	class Node<T>{
		Node<T> left, Right;
		T key;
		
		public Node(T key) {
			this.key = key;
		}
	}
	
	Node<T> root;
	InsertBSearchTree(){
		root = null;
	}
	
	public void insert(T key){
		root = insertRecursive(root, key);
	}
	
	private  Node<T> insertRecursive(Node<T> root, T key){
		
		if(root == null) {
			root = new Node<T>(key);
			return root;
		}
		
		Double rootKey = Double.valueOf(String.valueOf(root.key));
		Double tempkey = Double.valueOf(String.valueOf(key));
		
		if(tempkey < rootKey) {
			root.left = insertRecursive(root.left, key);
		}else if(tempkey > rootKey) {
			root.Right = insertRecursive(root.Right, key);
		}
		return root;
	}
	
	public void inorder() {
		inOrderRecursive(root);
	}
	
	private void inOrderRecursive(Node<T> root) {
		if(root !=null) {
			inOrderRecursive(root.left);
			System.out.println(root.key);
			inOrderRecursive(root.Right);
		}
	}
	
	public static void main(String[] args) {
		
		InsertBSearchTree<Double> tree = new InsertBSearchTree<>();
			/* Let us create following BST 
	        50 
	     /     \ 
	    30      70 
	   /  \    /  \ 
	 20   40  60   80 */
	  tree.insert(50.8); 
	  tree.insert(30.2); 
	  tree.insert(20.6); 
	  tree.insert(40.0); 
	  tree.insert(70.3); 
	  tree.insert(60.7); 
	  tree.insert(80.7); 
	
	  // print inorder traversal of the BST 
	  tree.inorder(); 
	}
}
