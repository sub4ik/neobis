package neobistasks.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FlaviousJosephusLegend {
	public static void main(String[] args) { // uri:  incomplete
		FlaviousJosephusLegend.findRemainingPerson();
	}
	
	public static void findRemainingPerson() {
		Scanner scan = new Scanner(System.in);
		//int testCasesNum = scan.nextInt();
		int peopleNum = scan.nextInt();
		int stepSize = scan.nextInt();
		
		List<Integer> listPeople = new ArrayList<Integer>();
		for (int i=1; i<=peopleNum; i++ ) {
			listPeople.add(i);
		} 
		
		int kill = 0;
		
		// [1, 2, 3, 4, 5]

		for(int i=listPeople.size(); i>=1; i--) {
			if(kill<(listPeople.size()-1)) {
				kill++;
				System.out.println("killed " + listPeople.get(kill));
				listPeople.remove(kill);
			} else {
				kill = kill - i;
			}
			
		}
		
		System.out.println(listPeople);//

		
		
	}
	
	public static void findRemainingPerson2() {
		Scanner scan = new Scanner(System.in);
		int testCasesNum = scan.nextInt();
		int peopleNum = scan.nextInt();
		int stepSize = scan.nextInt();
		
		int remainingPerson = 0;
		int start = 0;
		int kill = 0;
		
		int n = 0;
		while(n<testCasesNum) {
			for(int i=0; i<peopleNum-1; i++ ) {
				if(start>=peopleNum) {
				
				kill = start + stepSize;
				start = kill +1;
				System.out.println(start);
				} else {
					//start = 
				}
			}
			n++;
			System.out.println("Case " + n + ": " + start);
		}
	}


}
