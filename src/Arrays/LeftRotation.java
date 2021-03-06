package Arrays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {
	   private static final Scanner scanner = new Scanner(System.in);
	   public static void main(String[] args) throws IOException {

	        String[] nd = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nd[0]);

	        int d = Integer.parseInt(nd[1]);

	        int[] a = new int[n];

	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }

	        int[] result = rotLeft(a, d);
	        
			System.out.println("Array values");
			for(int i = 0;i<result.length;i++) {
				System.out.println(result[i]);
			}

	        scanner.close();
	    }
	private static int[] rotLeft(int[] a, int d) {
		// TODO Auto-generated method stub
		for(int i = 0;i<d;i++) {
			int temp = a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j] = a[j+1];
			}
			a[a.length-1] = temp;
		}
		return a;
	}
}
