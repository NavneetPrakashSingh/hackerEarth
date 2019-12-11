package Arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//link of the question: https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

public class GoogleSample {
	private static final Scanner scanner = new Scanner(System.in);
	public void PairSocks() throws IOException {
//	       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] ar = new int[n];

	        String inputString = scanner.nextLine().replaceAll("\\-","");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String result = solution(inputString, n);
	        System.out.println(result);

//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();
//
//	        bufferedWriter.close();

	        scanner.close();
	}
	private String solution(String inputString, int n) {
		System.out.println("Input String"+inputString+"Number"+n);
		return null;
	}

}
