package for_;
import java.util.Scanner;

public class Main_for_구구단 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
//		for(N = 1; N < 10; N++){              못풀었다...
//			System.out.println(N + " * 1 = " + N*1);
//			System.out.println(N + " * 2 = " + N*2);
//			System.out.println(N + " * 3 = " + N*3);
//			System.out.println(N + " * 4 = " + N*4);
//			System.out.println(N + " * 5 = " + N*5);
//			System.out.println(N + " * 6 = " + N*6);
//			System.out.println(N + " * 7 = " + N*7);
//			System.out.println(N + " * 8 = " + N*8);
//			System.out.println(N + " * 9 = " + N*9);
		
		for(int a = 1; a < 10; a++) {
			System.out.println(N+ " * "+ a + " = " + N * a);
		}
	}

}
