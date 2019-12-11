package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class CombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
    	System.out.println("Inside letter combination");
    	List<String> returningList = new ArrayList<String>();
    	Queue<String> queue = new LinkedList<String>();
    	
    	if(digits == "") {
    		return returningList;
    	}
    	
    	String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    	
    	queue.add("");
    	
    	while(!queue.isEmpty()) {
    		String currentElement = queue.poll();
    		
    		if(currentElement.length() == digits.length()) {
    			returningList.add(currentElement);
    		}else {
    			
    			int currentIndex = Integer.parseInt(String.valueOf(digits.charAt(currentElement.length())));
    			String otherStrings = map[currentIndex];
    			
    			for(int i=0;i<otherStrings.length();i++) {
    				queue.add(currentElement+otherStrings.charAt(i));
    			}
    		}
    	}
    	
        return returningList;
    }
	public static void main(String[] args) {
		CombinationsOfAPhoneNumber obj = new CombinationsOfAPhoneNumber();
		System.out.println(obj.letterCombinations("23"));
	}
}
