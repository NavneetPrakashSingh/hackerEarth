package geek4geek;

public class addNumbersInString {
	public static void main(String[] args) {
		String str = "1abc3";
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			int integerValueAtCurrentChar = str.charAt(i);
			if(integerValueAtCurrentChar<97) {
				sum += Character.getNumericValue(integerValueAtCurrentChar);
			}
		}
		System.out.println(sum);
	}
}
