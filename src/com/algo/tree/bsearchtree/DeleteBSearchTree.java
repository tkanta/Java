package com.algo.tree.bsearchtree;

public class DeleteBSearchTree<T extends Number> {
	
	class Node<T> {
		Node<T> left, right;
		T value;
		public Node(T val){
			this.value = val;
		}
	}
	
	public Node deleteKey(Node root, T value) {
		
		if(root == null) {
			return root;
		}
		
		Double valueToFind = Double.valueOf(String.valueOf(value));
		Double rootValue = Double.valueOf(String.valueOf(root.value));
		
		if(valueToFind < rootValue) {
			root.left = deleteKey(root.left, value);
		}
		
		return null;
	}
}
