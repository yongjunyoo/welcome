import java.util.Scanner;

public class Quiz_03 {
	
	public static int validInt(String msg){
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print(msg);
				int num = Integer.parseInt(sc.nextLine());
				return num;
			}catch(Exception e) {
				System.out.println("입력한 값이 숫자가 아닙니다.");
			}
		}
	}
	
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

				int num1 = validInt("첫 번째 숫자 입력 : ");
				int num2 = validInt("두 번째 숫자 입력 : ");
				
//				while(true) {
//					try {
//						System.out.print("첫 번째 숫자 입력 : ");
//						num1 = Integer.parseInt(sc.nextLine());
//						break;
//
//					}catch(Exception e) {
//						System.out.println("입력한 값이 숫자가 아닙니다.");
//						continue;
//					}
//				}
//					while(true) {
//						try {
//							System.out.print("두 번째 숫자 입력 : ");
//							num2 = Integer.parseInt(sc.nextLine());
//							break;
//
//						}catch(Exception e) {
//							System.out.println("입력한 값이 숫자가 아닙니다.");
//							continue;
//						}
//					}
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
