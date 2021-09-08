import java.util.Scanner;

public class Note {
	public static void main(String[] args) {

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("=== 계산기 프로그램 ===");
			System.out.print("연산자 입력(+,-,*,/) : ");
			String op = sc.nextLine();
			if(op.equals("q")) {
				System.out.println("계산기를 종료합니다.");
				break;
			}
			if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
				System.out.print("첫 번째 숫자 입력 : ");
				double num1 = Double.parseDouble(sc.nextLine());
				System.out.print("두 번째 숫자 입력 : ");
				double num2 = Double.parseDouble(sc.nextLine());
				System.out.println("===== 결 과 =====");
				switch(op) {
				case "+" : 
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break;
				case "-" : 
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					break;
				case "*" :
					System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
					break;
				case "/" :
					System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
					break;
				}
			}else {
				System.out.println("연산자를 잘못 입력하셨습니다.");
			}
		}
	}
}