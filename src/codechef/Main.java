/*
 * Problem statement: https://www.codechef.com/NPLQ2019/problems/NPLQ19D
 * */
package codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String args[]) {
		try {
			List<Character> visitedPlaces = new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			for(int i=0;i<=t;i++) {
				visitedPlaces.clear();
				String inputString = sc.next();
				
				for(int j = 0;j<inputString.length();j++) {
					if(visitedPlaces.contains(inputString.charAt(j))) {
						//do nothing as it alread contains the value
					}else {
						visitedPlaces.add(inputString.charAt(j));
					}
				}
				String outputString =visitedPlaces.stream()
												  .map(String::valueOf)
												  .collect(Collectors.joining());
				System.out.println(outputString);
			}
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
}
