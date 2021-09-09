import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요 : ");
		
		try {
			int number = Integer.parseInt(sc.nextLine());
			System.out.println("정상 입력 확인");
			// 예외가 발생할 것으로 예상되는 코드를 집어넣음.
			// 에러가 발생하지 않는다면 int num = Integer.parseInt(sc.nextLine());을 실행함.
		}catch(Exception e) {
			System.out.println("입력한 값은 숫자가 아닙니다.");
			// 에러가 발생하면 어떻게 처리해야하는지를 작성해놓은 것.
			// 에러가 발생해야만 실행.
		}
		System.out.println("프로그램 종료.");
      // System.out.println("입력한 숫자는" + num + "입니다."); 는 지역변수이기에 출력이 안됨.
	  // 방법 1. try 구문안에 넣는다.
	  // 방법 2. 메인 범위 안에 int num;을 설정하고 num = Integer.parseInt(sc.nextLine());를 끌어온다.
	}
}