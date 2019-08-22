package com.datastructure.tree.bsearchtree;

public class InsertBSearchTreeWithoutGeneric {

	/* Class containing left and right child of current node and key value*/
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    InsertBSearchTreeWithoutGeneric() {  
        root = null;  
    } 
  
    // This method mainly calls insertRec() 
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    void inorder()  { 
       inorderRec(root); 
    } 
  
    // A utility function to do inorder traversal of BST 
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
    
    public boolean search(int key) {
    	return searchRec(root, key) != null ;
    }
    private Node searchRec(Node root, int key) 
    { 
        // Base Cases: root is null or key is present at root 
        if (root==null || root.key==key) 
            return root; 
      
        // val is greater than root's key 
        if (root.key > key) 
            return searchRec(root.left, key); 
      
        // val is less than root's key 
        return searchRec(root.right, key); 
    } 
    
    // Driver Program to test above functions 
    public static void main(String[] args) { 
        InsertBSearchTreeWithoutGeneric tree = new InsertBSearchTreeWithoutGeneric(); 
  
        /* Let us create following BST 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80 */
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
  
        // print inorder traversal of the BST 
        tree.inorder(); 
        
        System.out.println(tree.search(40));
    } 
}
