package Arrays;

import java.util.Arrays;
import java.util.Hashtable;

public class uniqueValues {
	
	public String firstApproach(String arr) {
		//O(n^2) time complexity
		String[] arrValues = arr.split(" ");
		for(String values : arrValues) {
			int count =0;
			for(String insideValue : arrValues) {
				if(values.equals(insideValue)) {
					count = count + 1;
					System.out.println(count);
				}				
			}
			if(count>1) {
				System.out.println("Not unique");
				return "Not Unique";
			}
		}
		return "Unique";
	}
	public String secondApproach(String arr) {
		//O(nlog(n)) time complexity
		String[] currentString = arr.split(" ");
		Arrays.sort(currentString);
		String previousValue="";
		for(String values : currentString) {
			if(previousValue.equals(values)) {
				return "Not Unique";
			}else {
				previousValue = values;
			}
		}
		return "Unique";
	}
	
	public String thirdApproach(String arr) {
		//O(log(n) time complexity using hashtable

		Hashtable<String, Integer> table = new Hashtable<String,Integer>();
		String[] arrValues = arr.split(" ");
		for(String keys:arrValues) {
			if(table.containsKey(keys)) {
				int currentValue = table.get(keys);
				table.put(keys,currentValue+1);
			}else {
				table.put(keys, 0);
			}
			
		}
		for(String keys: arrValues) {
			if(table.get(keys)>0) {
				return "Not Unique";
			}
		}
		return "Unique";
	}

}
