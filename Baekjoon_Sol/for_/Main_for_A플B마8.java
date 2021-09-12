package for_;

import java.util.Scanner;

public class Main_for_A플B마8 {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int a=1; a<=T; a++) {

			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			System.out.println("Case #" + a + ": " + num1 + " + " + num2 + " = " + (num1+num2));
		}

	}
}
