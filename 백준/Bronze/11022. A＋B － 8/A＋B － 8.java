import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
	
		for (int x = 1 ; x <= s ; x++) {
			int j = sc.nextInt();
			int k = sc.nextInt();		
			System.out.println("Case #"+x+": "+j+" + "+k+" = "+(int)(j+k));
		}
	}

}
