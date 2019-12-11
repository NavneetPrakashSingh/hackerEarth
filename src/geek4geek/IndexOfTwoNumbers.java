package geek4geek;

import java.util.Arrays;

public class IndexOfTwoNumbers {

    public int[] twoSum(int[] nums, int target) {
        int[] finalResult = new int[2];
        Arrays.sort(nums);
        int totalLength = nums.length-1;
        System.out.println(totalLength);
        for(int i =0;i<totalLength/2;i++) {
        	for(int j=0;j<totalLength;j++) {
        		if(i == j) {
        			//don't add here since the numbers are not repeating
        		}else {
        			if(nums[i]+nums[j] == target) {
        				finalResult[0] = i;
        				finalResult[1] = j;
        				return finalResult;
        			}
        		}
        	}
        }
        return finalResult;
    }
	public static void main(String args[]) {
		IndexOfTwoNumbers indexObj = new IndexOfTwoNumbers();
		int[] arr = new int[] {3,2,4};
		int target = 9;
		int[] finalresult = indexObj.twoSum(arr, target);
		System.out.println(finalresult[0]);
		System.out.println(finalresult[1]);
	}
}

