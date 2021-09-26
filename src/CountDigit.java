
public class CountDigit {

	public static void main(String[] args) {
	
    int num = 13456676;
	int count =0;
		
		if (num==0) {
			System.out.println(0);
		}else {
			for(int j = num; j > 0; j = j/10) {
				count ++;
			}
			System.out.println("Number of digits: " + count);
			
			}

	}

}
