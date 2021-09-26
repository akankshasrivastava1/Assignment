
public class Largest {

	public static void main(String[] args) {
		
		int num[]= {19,22,12,34,56,68};
		int largest=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
		}

	System.out.print("largest number is:"+largest);

	}

}
