package geek4geek;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		String[] inputStrings = {"geek4geek1","another23","andAnother52"};
		Stream<String> result = Arrays.stream(inputStrings);
		
		result.forEach(values -> System.out.println(values));
	}
}
