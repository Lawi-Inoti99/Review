package QuadraticSorting;

import java.util.ArrayList;

public class insertion {
	
	public static void main (String [] args) {

	ArrayList<Integer> nums = new ArrayList<Integer>();
	nums.add(23);
	nums.add(98);
	nums.add(78);
	nums.add(89);
	nums.add(56);
	nums.add(0);
	System.out.println(nums);
	
	ArrayList<Integer> newnum = new ArrayList<Integer>();
	
	
	for (int i =0; i<nums.size();i++) {
		for (int j = i+1; j<nums.size();j++) {
			
			if (nums.get(j)>nums.get(i)) {
				newnum.add(i);
				
				
				
				
			}			
		}	
	}
	System.out.println(newnum);
	
	
	}

}
