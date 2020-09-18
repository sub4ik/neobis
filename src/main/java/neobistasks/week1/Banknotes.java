package neobistasks.week1;

public class Banknotes {
	public static void main(String[] args) {
		//int x
		Banknotes.calculateSmallestBanknotes(11257);
	}
	
	public static void calculateSmallestBanknotes(long num) {
		long hundreds, fifties, twenties, tens, fives, twos, ones;
		if(num>=100) {
			hundreds = (num / 100);                  // 5 -> 5*100 = 500
			System.out.println(hundreds);
			fifties = (num - (hundreds * 100)) / 50; //    76
			System.out.println(fifties);
			twenties = (num - ((hundreds * 100)+ (fifties * 50))) / 20;
			System.out.println(twenties);
			tens = (num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20))) / 10;
			System.out.println(tens);
			fives = (num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10))) / 5;
			System.out.println(fives);
			twos = (num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10) + (fives * 5))) / 2;
			System.out.println(twos);
			ones = (num - ((hundreds * 100)+ (fifties * 50) + (twenties * 20) + (tens * 10) + (fives * 5) + (twos * 2))) / 1;
			System.out.println(ones);



		}
		
	}

}
