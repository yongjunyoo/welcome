import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 예외처리 - try ~ catch구문

		System.out.println("숫자를 입력하세요 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		// 11번 라인은 숫자 외에 입력시 오류 발생지점, 11번 라인 다음부터 main 밖으로 튕겨저나감.


		System.out.println("입력한 숫자는 " + num1 + "입니다.");
		// Integer.parseInt는 숫자를 입력하면 오류가 발생하지 않음. 
		// but 문자입력하면  java.lang.NumberFormatException 오류 발생.
		
		
		// 그렇다면 방법은? try ~ catch 구문 활용.
		
		
		System.out.println("숫자를 입력하세요 : ");
		
		try {
			int num2 = Integer.parseInt(sc.nextLine());
			// 예외가 발생할 것으로 예상되는 코드를 집어넣음.
			System.out.println("정상 입력 확인");
		}catch(Exception e) {
			System.out.println("입력한 값은 숫자가 아닙니다.");
			// 에러가 발생하면 어떻게 처리해야하는지를 작성해놓은 것.
			// 에러가 발생해야만 실행.
		}
		System.out.println("프로그램 종료.");

	}
}
