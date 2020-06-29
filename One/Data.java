package One;

import java.util.ArrayList;

public class Data {

	public static void main(String[] args) {
		Data[] type = new Data[90];
		ArrayList l = new ArrayList();


		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		cars.add("Ferari");
		cars.add("Benz");
        cars.add("Lambo");
        for(int i =0; i<cars.size();i++) {
        	System.out.println(cars.get(0));
        }
        
		ArrayList<String> vehicles = new ArrayList<String>(); // Create an ArrayList object
          
        
        
        
        
        
        
        String words = new String("HELLO GOODBYE!");
        ArrayList<Character> sample = new ArrayList<Character>();

        for(int i = 0; i<words.length(); i++){
            sample.add(words.charAt(i));
            System.out.print(sample.get(i));
            
        }
        
	}

}
