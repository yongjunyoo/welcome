import java.util.Scanner;

public class Quiz_02_TryCatch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu;
		int money = 3000;
		int cola = 0;
		int cider = 0;
		int plumtea = 0;

		while(true) {
			System.out.println("=== 자판기 시뮬레이터 ===");
			System.out.println("1.콜라(1000) 2.사이다(800) 3.매실차(1500) [0.소지품 확인]");
			System.out.print(">>");
			
			while(true) {
				try {
					menu = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("숫자를 입력해주세요.");
				}	
			}

			if(menu == 1) {
				if(money>=1000) {
					money -= 1000;
					cola++;
				}else {
					System.out.println("잔액이 부족합니다.");
				}

			}else if(menu == 2) {
				if(money>=800) {
					money -=800;
					cider++;
				}else {
					System.out.println("잔액이 부족합니다.");
				}

			}else if(menu == 3) {
				if(money>=800) {
					money -=1500;
					plumtea++;
				}else {
					System.out.println("잔액이 부족합니다.");
				}

			}else if(menu == 0) {
				System.out.println("현재 소지금 : " + money);
				System.out.println("콜라 : " + cola);
				System.out.println("사이다 : " + cider);
				System.out.println("매실차 : " + plumtea);


			}else {
				System.out.println("메뉴를 다시 확인해주세요.");
			}
		}
	}
}