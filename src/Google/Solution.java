package Google;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

	public int solution(String S1, String S2) {
		
		int currentIndex =0;
		int nextIndex =0;
		int finalSum = 0;
		char previousChar =' ';
		for(int i=0;i<S2.length();i++) {
			System.out.println(currentIndex+"--"+nextIndex);
			if(S1.indexOf(S2.charAt(i))>-1) {
				nextIndex = Math.abs(S1.indexOf(S2.charAt(i)));
				if(previousChar == S2.charAt(i)) {
					if(nextIndex == currentIndex) {		
					}
				}else {
					currentIndex = Math.abs(currentIndex - Math.abs(S1.indexOf(S2.charAt(i))));
					finalSum= finalSum + currentIndex;
				}
				
				previousChar = S2.charAt(i);
			}else {
				System.out.println("Inside else");
				break;
			}
		}
		return finalSum;
	}
	
	
}