import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int no3 = sc.nextInt();
		
		int sum = no1 * no2 * no3;
	
	
		String str = String.valueOf(sum);
		
		for (int i = 0; i<10;i++){
			int count = 0; // 초기값으로 돌려야한다. 
			for(int j = 0; j<str.length();j++) {
			 if((str.charAt(j)-'0') == i) {
				 count++;
			 }
		 }
		 
		 System.out.println(count);
		}
		
	}
		
}
