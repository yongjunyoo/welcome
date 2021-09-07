import java.util.Scanner;

public class Quiz_10_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 구구단 출력 프로그램 ===");
		System.out.print("1 ~ 9단 중 선택 : ");
		int 구구단 = Integer.parseInt(sc.nextLine());

		if(1<=구구단 && 구구단<=9) {
			int a = 0;
			while(a<9) {
				a++;
				System.out.println(구구단 + " * " + a + " = " + 구구단*a);
			}
		}else{
			System.out.println("구구단 범위를 다시 확인하세요.");
		}
	}
}