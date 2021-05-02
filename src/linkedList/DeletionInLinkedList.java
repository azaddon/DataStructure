package linkedList;

public class DeletionInLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
	
		Node(int d){
		data =d;
		next =null;
		}
	}	
	
	public void deleteNode(int key){
	Node temp = head, prev=null;
		if (temp!=null && temp.data == key){
			temp =temp.next;
			return;
		}
		
		while(temp!=null && temp.data!=key){
			prev =temp;
			temp= temp.next;
			if(temp ==null){
				return;
			}
			prev.next = temp.next;
		}
	}
	
	public void push(int data){
		Node n = new Node(data);
		n.next =head;
		head =n;
	}
	
	public void printList(){
		Node tnode = head;
		while(tnode!=null){
			System.out.println(tnode.data+" ");
			tnode = tnode.next;
		}
	}
	public static void main(String []args){
		
		DeletionInLinkedList l = new DeletionInLinkedList();
		
		l.push(7);
		l.push(3);
		l.push(5);
		l.push(8);
		System.out.println("Created list:");
		l.printList();
		l.deleteNode(5);
		System.out.println("After Deletion:");
		l.printList();
		
	}
}
