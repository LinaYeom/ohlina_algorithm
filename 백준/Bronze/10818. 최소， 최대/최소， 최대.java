import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a); // 오름차순으로 정렬하는 원소 값 
		System.out.println(a[0]+" "+a[n-1]); // n-1 은 마지막배열의 원소값 
	}
}
