package for_;

import java.util.Scanner;

public class Main_for_A플B마7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int i = 0;

		for(int a=1; a<=T; a++) {
			i++;
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Case #" + i + ": " + (num1+num2));
		}
	}
}
