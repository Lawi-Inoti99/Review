package LinkedList;

import java.util.LinkedList;

public class linkedlibrary {
	
	public static void main (String [] args) {
	
	LinkedList<String> object = new LinkedList<String>();
	
	//the following are the methods found in the java.util class for the linked list
	
	   // Adding elements to the linked list 
    object.add("A"); 
    object.add("B"); 
    object.addLast("C"); 
    object.addFirst("D"); 
    object.add(2, "E"); 
    object.add("F"); 
    object.add("G"); 
    System.out.println("Linked list : " + object); 
	
	
 // Removing elements from the linked list 
    object.remove("B"); 
    object.remove(3); 
    object.removeFirst(); 
    object.removeLast(); 
    System.out.println("Linked list after deletion: " + object); 

    
    
    
    
    
    
    
	}
}
