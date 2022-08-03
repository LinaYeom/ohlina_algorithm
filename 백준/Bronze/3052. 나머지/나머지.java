import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int b[] = new int[10]; // 저장할 배열
		int count = 0;
		boolean a ;

		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt() % 42; // 값받아서
		}

		for (int i = 0; i < b.length; i++) {
			a = false;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j]) {
					a = true;
					break;
				}
			}
			if(a == false) {
				count ++;
			}
//			System.out.println(b[i]);
		}
		System.out.println(count);

	}

}
