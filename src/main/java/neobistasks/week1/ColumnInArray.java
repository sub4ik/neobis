package neobistasks.week1;

import java.util.Arrays;
import java.util.Scanner;

public class ColumnInArray {
	
	public  static void main(String[] args) {
		ColumnInArray.findSumOrAvg(2, "M");
	}
	
	public static void findSumOrAvg(int num, String str) {
		
		
		float avg = 0, sum = 0;
		float[][] M = new float[3][3]; //12
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<3; i++) { //12
			for(int n=0; n<3; n++) { //12
				M[i][n] = scan.nextFloat();
			}
		} System.out.println(Arrays.deepToString(M));
		
		
		//int num = scan.nextInt();
		
		//String charT = scan.nextLine();
		for(int i=0; i<3; i++) { //12
			sum = sum + M[i][num];
			}
		if (str.equals("S")) {
			System.out.println(sum);

		} else if (str.equals("M")) {
			System.out.println(sum/3); //12
		}
		
		
	}

}
