import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// 1. 0 =< 99 
		// 2. 10> 0 => 0x 
		// 3. A + B = sum 
		// 4. sc 처음 받는 값이 돌아올때까지 => 사이클 수 구하기 total + 1
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int save = start;
		int count =0;
		sc.close();
		
		String st ;
		
		while(true) {
			st = "";
			st+= save%10; // String의 두번째 자리를 구한다 // A+B= sum 에서 B를 구한것 
			st+= ((save/10)+(save%10))%10; // sum의 두번째 자리를 구한것 
//			System.out.println(st); // 값제대로 나오나 확인해보자!
			
			save = Integer.parseInt(st);
			
			count++;
			
			if(start == save) {
				System.out.println(count);
				break;
			}
		}
		
		
		
	}

}
