import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int j = s;
		
		for (int i = 0; i < s; i++) {
			System.out.println(j);
			j --;
		}

	}
}