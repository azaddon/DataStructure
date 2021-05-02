package bst;

public class BSTImplementation {
	
	static Node root;
	
	class Node{
		int data;
		Node left,right;
	
	Node(int d){
		data = d;
		left=right=null;
	}
	}
	
	BSTImplementation(){
		root = null;
	}
	
	public Node search(Node root, int key){
		if(root ==null  || root.data ==key)
			return root;
		if(root.data <= key)
			return search(root.right,key);
	
		return search(root.left , key);
		
	}
	
	void insert(int key)  
    {  
         root = insertRecord(root, key);  
    }
	
	public Node insertRecord(Node root, int key){
		
		if(root == null){
			root = new Node(key);
			return root;
		}
			
			
		if(root.data < key){
			root.right = insertRecord(root.right ,key);
		}
		else if (root.data > key) {
			root.left = insertRecord(root.left ,key);
		}
		return root;	
	}
	
	void delete(int key){
		root =deleteRecord(root,key);
	}
	
	Node deleteRecord(Node root, int key){
		if(root  == null)
			return root;
		
		if(key >root.data){
			root.right = deleteRecord(root.right ,key);
		}
		else if (key < root.data) {
			root.left = deleteRecord(root.left ,  key);
		}
		else{
			if(root.left == null)
				return root.right;
			else if (root.right == null) {
				return root.left;
			}
			
			root.data = minValue(root.right);
			root.right = deleteRecord(root.right, root.data);
		}
		return root;
		
	}
	
	int minValue(Node root){
		int minVal = root.data;
		while(root.left!= null){
			minVal = root.left.data;
			root = root.left;
		}
		return minVal;
	}
	
	void inorder()  
    {  
         inorderRec(root);  
    } 
	
	void inorderRec(Node root){
		if(root!=null){
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSTImplementation bst = new BSTImplementation();
		bst.insert(10);
		bst.insert(20);
		bst.insert(50);
		bst.insert(30);
		bst.insert(15);
		bst.insert(18);
		bst.insert(22);
		
		bst.inorder();
		
		System.out.println("\nDelete 20");
        bst.delete(20);
        System.out.println(
            "Inorder traversal of the modified tree");
        bst.inorder();
 
        System.out.println("\nDelete 30");
        bst.delete(30);
        System.out.println(
            "Inorder traversal of the modified tree");
        bst.inorder();
 
        System.out.println("\nDelete 50");
        bst.delete(50);
        System.out.println(
            "Inorder traversal of the modified tree");
        bst.inorder();
    }
		
	

}
