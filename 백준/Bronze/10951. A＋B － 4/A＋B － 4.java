import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 입력은 여러개의 케이스로 
	 * 각 케이스 마다 A+B 를 출력 
	 * 	1 1		2
		2 3		5
		3 4		7
		9 8		17
		5 2		7
	 * 	
	 */
		// 스캐너로 EOF 하기 
		Scanner sc = new Scanner(System.in);
		
		
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}
}

