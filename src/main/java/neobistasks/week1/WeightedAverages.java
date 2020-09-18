package neobistasks.week1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeightedAverages {
	public  static void main(String[] args) throws ParseException {
		WeightedAverages.getWeightedAverages(3);
	}
	
	public static void getWeightedAverages(int num) {
		int numsPerLine = 3;
		float weight1 = 0.2f;
		float weight2 = 0.3f;
		float weight3 = 0.5f;
		
		float weightAvg = 0;
		
		Scanner scan = new Scanner(System.in);
		List<Float> list = new ArrayList<Float>();

		for(int n=0; n<num; n++) {

			for (int i=0; i<3; i++) {
				float numValue= scan.nextFloat();
				weightAvg = numValue * weight1;
				list.add(numValue); 
				
			
			
			}
			System.out.println(list);
			
			
		}
		System.out.println(list);

		
	}

}
