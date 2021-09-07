import java.util.Scanner;

public class Quiz_02_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 100 사이의 숫자를 입력해주세요.");
		int num = Integer.parseInt(sc.nextLine());
		
		if(0<num && num<101 && num % 2 == 1) {
			System.out.println("=== 결 과 ===");
			System.out.println("입력한 숫자는 홀수 입니다.");
		}else if(0<num && num<101 && num % 2 == 0){
			System.out.println("=== 결 과 ===");
			System.out.println("입력한 숫자는 짝수 입니다.");
		}else {
			System.out.println("범위를 벗어났습니다.");
		}
	}
}