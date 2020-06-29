package LinkedList;

public class SinglyLinkedList {
   Node head;
   

   //nested Node class
	static class Node{
		Node next;
		int data;	
		//constructor for the node
		Node (int d){
			data = d;
			next=null;	
		}
	}
	
	
	 public static SinglyLinkedList insert(SinglyLinkedList list, int data) {

		 // Create a new node with given data  as indicated in the constructor
	        Node new_node = new Node(data); 
	        new_node.next = null; 
	  
	        // If the Linked List is empty, 
	        // then make the new node as head 
	        if (list.head == null) { 
	            list.head = new_node; 
	        } 
	        else { 
	            // Else traverse till the last node 
	            // and insert the new_node there 
	            Node last = list.head; 
	            while (last.next != null) { 
	                last = last.next; 
	            } 
	  
	            // Insert the new_node at last node 
	            last.next = new_node; 
	        } 
	  
	        // Return the list by head 
	        return list; 

		
	}
	 
	// Method to print the LinkedList. 
	    public static void printList(SinglyLinkedList list) 
	    { 
	        Node currNode = list.head; 
	   
	        System.out.print("LinkedList: "); 
	   
	        // Traverse through the LinkedList 
	        while (currNode != null) { 
	            // Print the data at current node 
	            System.out.print(currNode.data + " "); 
	   
	            // Go to next node 
	            currNode = currNode.next; 
	        } 
	    } 
	    public static void main(String[] args) 
	    { 
	      
	    	
	    	/* Start with the empty list. */
	        SinglyLinkedList list = new SinglyLinkedList(); 
	  
	        // 
	        // ******INSERTION****** 
	        // 
	  
	        // Insert the values 
	        list = insert(list, 1000); 
	        list = insert(list, 8782); 
	        list = insert(list, 993); 
	        list = insert(list, 409); 
	        list = insert(list, 95); 
	        list = insert(list, 609); 
	        list = insert(list, 9097); 
	        list = insert(list, 8); 
	  
	        // Print the LinkedList 
	        printList(list); 
	    } 

}
