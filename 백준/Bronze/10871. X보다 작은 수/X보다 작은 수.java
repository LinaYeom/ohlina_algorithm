import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 10 5
		// 1 10 4 9 2 3 8 5 7 6

		// 결과 : 1 4 2 3
		// A에서 X 보다 작은 수를 구하시오

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 1; i <= a; i++) {
			int n = sc.nextInt();
			arr.add(n);
			if (n < x) {
				System.out.print(n+" ");
			}
		}
	}
}
