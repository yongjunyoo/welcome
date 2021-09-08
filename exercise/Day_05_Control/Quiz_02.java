import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 계산기 프로그램 ===");
		System.out.print("연산자 입력(+,-,*,/) : ");
		String input1 = sc.nextLine();
		while(true) {
			System.out.print("연산자 입력을 종료하시려면 q를 눌러주세요. : ");
			String input2 = sc.nextLine();
			if(input2.equals("q")) {
				System.out.println("연산자 입력을 종료합니다.");
				break;
			}
		}
		System.out.print("첫 번째 숫자 입력 : ");
		double num1 = Double.parseDouble(sc.nextLine());
		System.out.print("두 번째 숫자 입력 : ");
		double num2 = Double.parseDouble(sc.nextLine());		

		if(input1.equals("+")) {
			System.out.println("===== 결과 =====");
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));	
		}else if(input1.equals("-")) {
			System.out.println("===== 결과 =====");
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		}else if(input1.equals("/")) {
			System.out.println("===== 결과 =====");
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		}else if(input1.equals("*")){
			System.out.println("===== 결과 =====");
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		}else {
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}
	}
}