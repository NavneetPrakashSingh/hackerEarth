package Arrays;

import java.util.Scanner;

public class Memorize {
	public void MemorizeHackerEarth() {
		Scanner inputSizeOfArray = new Scanner(System.in);
		int sizeOfArray = inputSizeOfArray.nextInt();
		int[] arrayValues = new int[sizeOfArray];
		Scanner inputArrayValues = new Scanner(System.in);
		for(int i=0;i<sizeOfArray;i++) {
			if(inputArrayValues.hasNext()) {
				arrayValues[i] = inputArrayValues.nextInt();
			}			
		}
		Scanner inputNumberOfItemsToSearch = new Scanner(System.in);
		int numberOfItemsToSearch = inputNumberOfItemsToSearch.nextInt();
		for(int i=0;i<numberOfItemsToSearch;i++) {
			int count = 0;
			Scanner inputNumber = new Scanner(System.in);
			int inputNumberValue = inputNumber.nextInt();
			for(int j=0;j<sizeOfArray;j++) {
				if(inputNumberValue == arrayValues[j]) {
					count ++;
				}
			}
			if(count > 0) {
				System.out.println(count);
			}else {
				System.out.println("NOT PRESENT");
			}
			
			
		}
		inputNumberOfItemsToSearch.close();
		inputSizeOfArray.close();
		inputArrayValues.close();
	}
	
	public void optimizedHackerRankMemorizeSolution(){
		int[] inputArray = new int[1001];
		for(int i=0;i<inputArray.length;i++) {
			inputArray[i] = 0;
		}
		Scanner inputSizeOfArray = new Scanner(System.in);
		int sizeOfArray = inputSizeOfArray.nextInt();		
		Scanner inputArrayValues = new Scanner(System.in);
		for(int i=0;i<sizeOfArray;i++) {
			if(inputArrayValues.hasNext()) {
				int inputIndex = inputArrayValues.nextInt();
				inputArray[inputIndex] = inputArray[inputIndex] + 1;
			}			
		}
		Scanner inputCount = new Scanner(System.in);
		int inputCountSize = inputCount.nextInt();
		for(int i = 0;i<inputCountSize;i++) {
			Scanner checkInputValue = new Scanner(System.in);
			int checkValueOf = checkInputValue.nextInt();
			if(inputArray[checkValueOf] > 0) {
				System.out.println(inputArray[checkValueOf]);
			}else {
				System.out.println("NOT PRESENT");
			}
		}
	}
}
