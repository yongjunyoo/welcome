import java.util.Scanner;

public class Home_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 1 ~ n 까지의 합 구하기 ===");
		System.out.print("n 입력 : ");
		int num = Integer.parseInt(sc.nextLine());

		if(1<=num && num <=100) {

			int sum = 0;
			int a = 0;
			while(a<num) {
				a++;
				sum += a;
			}
			System.out.println("1 ~ "+ num + "까지의 합은" + sum + "입니다.");
		}else {
			System.out.println("숫자 범위를 초과하였습니다.");
		}
	}
}