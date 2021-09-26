
public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 17;
		int count_of_factor = 0;
		for (int i = 1; i<=num;i++) {
			if (num % i == 0) {
				count_of_factor = count_of_factor + 1;
			}
		}
		
		if(count_of_factor ==2) {
			System.out.println("prime");
			
		}else {
			System.out.println("Not prime");
		}

	}

}
