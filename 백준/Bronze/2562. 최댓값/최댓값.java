import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];

		int max = 0;
		int count = 1;
		for (int i = 0; i < 9; i++) {
			int n = sc.nextInt();
			a[i] = n;
			if (n > max) {
				max = n;
			}

		}
		int[] b = Arrays.copyOf(a, a.length);
		for (int i = 0; i < a.length; i++) {
			if (b[i] != max) {
				count++;
			} else {
				break;
			}

		}
		System.out.println(max + " " + count);
	}

}
