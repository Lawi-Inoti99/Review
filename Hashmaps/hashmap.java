package Hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap {
	
	/**
	To access a value one must know its key. 
	HashMap is known as HashMap because it uses a technique called Hashing. 
	Hashing is a technique of converting a large String to small String that represents the same String. 
	A shorter value helps in indexing and faster searches. 
	HashSet also uses HashMap internally.
	HashMap doesn’t allow duplicate keys but allows duplicate values.
	 That means A single key can’t contain more than 1 value but more than 1 key can contain a single value.
	**/
	
	public static void main (String [] args) {
		
		  HashMap <String, String> map = new HashMap <String,String>();
		  map.put("Nairobi", "Kenya");
		  map.put("Kigali","Rwanda" );
		  map.put("kigali", "remappingFunction");
		  map.put("Buja","Burundi" );
		  map.put("Montreal","Canada" );
		  map.put("Vancouver","Canada" );
		  map.put("Nyc","USA" );
		  
			for (Entry<String, String> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " = " + entry.getValue());
		         
				  for (Entry<String, String> e : map.entrySet()) 
			            System.out.println(e.getKey() + " " + e.getValue()); 
			    } 
			
			
			System.out.println("Initial Mappings are: " + map);
			 // Creating a new hash map and copying 
		    HashMap<String, String> new_hash_map = new HashMap<String, String>(); 
		    new_hash_map.putAll(map); 
		    new_hash_map.remove("Nairobi");
		    System.out.println(new_hash_map.get("kigali"));
		  
		    System.out.println("Final mapings are  " + new_hash_map);
		
	}
	
	

}
