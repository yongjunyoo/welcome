import java.util.Scanner;

public class Quiz_02_Teacher {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("==== 계산기 프로그램 ====");
			System.out.print("연산자 입력(+,-,*,/) : ");
			String op = sc.nextLine();
			if(op.equals("q")) {
				System.out.println("계산기를 종료합니다.");
				break;
				//return; ---> 자신이 속한 메소드를 나가겠다는 뜻.
				//System.exit(0);
			}
			if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
		//  if(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
		//	System.out.println("연산자를 다시 확인해주세요.");
		//  continue; ----> 다시 while문으로 보내버림.

				System.out.print("첫 번째 숫자 입력 : ");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.print("두 번째 숫자 입력 : ");
				int num2 = Integer.parseInt(sc.nextLine());

				System.out.println("===== 결과 =====");

				switch(op) {
				case "+" :
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break;
				case "-" :
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					break;
				case "*" :
					System.out.println(num1 + " * " + num2 + " = " + ((double)num1*num2));
					break;
				case "/" :
					System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2));
					break;
					//case "q" :
					// break wh; -> while앞에 wh:while하면 while이 나가짐.
					// System.exit(0); -> 그냥 꺼져버림.
					// return;
				}
			}else {
				System.out.println("연산자를 다시 확인해주세요.");
			}
		}
	}
}
