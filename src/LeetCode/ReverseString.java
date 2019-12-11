package LeetCode;

public class ReverseString {
	
    public void reverseString(char[] s) {
        char temp;
        for(int i=0;i<s.length/2;i++) {
        	temp = s[i];
        	s[i] = s[s.length-1-i];
        	s[s.length-1-i] = temp;
        }
        System.out.println(s);
    }
    
	public static void main(String[] args) {
		char[] currentArray = new char[5];
		currentArray[0] = 'h';
		currentArray[1] = 'e';
		currentArray[2] = 'l';
		currentArray[3] = 'l';
		currentArray[4] = 'o';
		ReverseString reverseObj = new ReverseString();
		reverseObj.reverseString(currentArray);
	}
}
