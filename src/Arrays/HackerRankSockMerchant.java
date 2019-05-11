package Arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//link of the question: https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

public class HackerRankSockMerchant {
	private static final Scanner scanner = new Scanner(System.in);
	public void PairSocks() throws IOException {
//	       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] ar = new int[n];

	        String[] arItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arItem = Integer.parseInt(arItems[i]);
	            ar[i] = arItem;
	        }

	        int result = sockMerchant(n, ar);
	        System.out.println(result);

//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();
//
//	        bufferedWriter.close();

	        scanner.close();
	}
	private int sockMerchant(int n, int[] ar) {
		int[] sockPair = new int[100000];
		for(int i=0;i<sockPair.length;i++) {
			sockPair[i] = 0;
		}
		for(int i=0;i<ar.length;i++) {
			sockPair[ar[i]] = sockPair[ar[i]] + 1;
		}
		int count = 0;
		for(int i=0;i<sockPair.length;i++) {
			count = count + (sockPair[i] /2);
		}
		return count;
	}
}
