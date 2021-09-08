import java.util.Scanner;

public class Home_01_Review {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("=== 1 ~ n 까지의 합 구하기 ===");
		System.out.print("n 입력 : ");

		int num = Integer.parseInt(sc.nextLine());
		int sum = 0; // 증가하는 i의 값을 모두 더해서 누적하는 변수로 사용.
		int i = 0;
		if(1<=num && num <=100) {
			while(i<num) {
				i++;
				sum += i;
			}
			System.out.println("1 ~ " + i + " 까지의 합은 " + sum);
		}else {
			System.out.println("숫자 범위를 벗어났습니다.");
		}
	}
}
