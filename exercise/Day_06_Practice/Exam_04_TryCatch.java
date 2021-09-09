import java.util.Scanner;

public class Exam_04_TryCatch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//계산기 문제를 활용한다면...
		// while(true){
		//             ~~~~
		// 앞서 while문이 있었기에 continue를 쓰려면 while문을 하나 더 써줘야 한다.
		// but, continue를 썼기에 while문을 벗어날 수 없다. 따라서 break를 써야한다.
		// 또한, 고객친화적으로 소프트웨어를 개발하려면 1번 트라이를 제대로 입력하고
		//  2번을 잘못입력한다면 2번으로 돌아가게 해야하기에 try catch문을 한번더 사용한다.

		while(true) {
			try {
				System.out.print("첫 번째 숫자 입력 : ");
				int num1 = Integer.parseInt(sc.nextLine());
				break;

			}catch(Exception e) {
				System.out.println("입력한 값이 숫자가 아닙니다.");
				continue;
			}
		}
			while(true) {
				try {
					System.out.print("두 번째 숫자 입력 : ");
					int num2 = Integer.parseInt(sc.nextLine());
					break;

				}catch(Exception e) {
					System.out.println("입력한 값이 숫자가 아닙니다.");
					continue;
				}
			}
		}
	}