package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);
        scanner.close();
    }

	private static int hourglassSum(int[][] arr) {
		// TODO Auto-generated method stub
		int max = -9999999;
//		for(int outer = 0; outer<4;outer++) {
//			max = arr[]
//		}
		int currentValue = 0;
		int count =0;
		for(int i=0;i<4;i++) {
			for(int j=i;j<i+3;j++) {	
				System.out.println(i+"----------------"+j);
				currentValue = currentValue + arr[i][j] + arr[i+2][j];
				if(count == 1) {
					currentValue = currentValue + arr[i+1][j];
				}
				count = count +1;
			}
			count =0;
		}
		return 0;
	}
}
