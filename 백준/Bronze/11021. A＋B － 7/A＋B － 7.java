import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        for(int i = 0; i<a; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            int hap = b+c;
            count ++;
            System.out.println("Case #"+count +": "+hap);
        }
    }
}
