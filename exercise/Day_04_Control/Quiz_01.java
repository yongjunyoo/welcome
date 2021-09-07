import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 숫자를 입력해주세요.");
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		
		if(num1 == num2) {
			System.out.println("==== 결 과 ====");
			System.out.println("두 숫자가 같다.");
		}else if(num1 > num2) {
			System.out.println("==== 결 과 ====");
			System.out.println("첫 번째 숫자가 크다.");
		}else {
			System.out.println("==== 결 과 ====");
			System.out.println("두 번째 숫자가 크다");
		}
	}

}
