package Arrays;

import java.util.Scanner;

public class MonkAndWelcome {
	public void MonkWelcome() {
		Scanner inputSizeOfArray = new Scanner(System.in);
		int sizeOfArray = inputSizeOfArray.nextInt();
		int[] inputArray = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++) {
			inputArray[i] = 0;
		}
		Scanner scanInputValues = new Scanner(System.in);
		for(int i=0;i<sizeOfArray;i++) {
			int inputValues = scanInputValues.nextInt();
			inputArray[i] = inputArray[i] + inputValues;
		}
		
		Scanner scanSecondInput = new Scanner(System.in);
		for(int i=0;i<sizeOfArray;i++) {
			int inputValues = scanSecondInput.nextInt();
			inputArray[i] = inputArray[i] + inputValues;
		}
		
		for(int i=0;i<sizeOfArray;i++) {
			System.out.print(inputArray[i]+" ");
		}
		
	}
}
