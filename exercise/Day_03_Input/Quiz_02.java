import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		// 여러가지 숫자 두개를 입력받아
		// 덧셈한 결과를 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 두개 입력하세요.");
		
		String num1 = sc.nextLine();
		int result1 = Integer.parseInt(num1);
		int result2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("숫자를 더한 값은 : " + (result1 + result2));
	}
}