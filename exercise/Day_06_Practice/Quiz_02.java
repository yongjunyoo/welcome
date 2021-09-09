import java.util.Scanner;

public class Quiz_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int money = 3000;
		int cola = 1000;
		int cider = 800;
		int maesil = 1500;
		int colacount = 0;
		int cidercount = 0;
		int maesilcount = 0;

		while(true) {
			System.out.println("=== 자판기 시뮬레이터 ===");
			System.out.println("음료수를 선택하세요.");
			System.out.println("1.콜라(1000) 2.사이다(800) 3.매실차(1500) [0.소지품확인]");
			int menu = sc.nextInt();

			if(menu == 1) {
				if(money>=cola) {
					System.out.println("콜라를 구매했습니다.");
					colacount++;
					System.out.println("콜라" + "+" + colacount);
					money -= cola;
					System.out.println("소지금" + money);
				}else {
					System.out.println("잔액이 부족합니다.");
				}
			}else if(menu == 2) {
				if(money>=cider) {
					System.out.println("사이다를 구매했습니다.");
					cidercount++;
					System.out.println("사이다" + "+" + cidercount);
					money -= cider;
					System.out.println("소지금" + (money));
				}else {
					System.out.println("잔액이 부족합니다.");
				}
			}else if(menu == 3) {
				if(money>=maesil) {
					System.out.println("매실차를 구매했습니다.");
					maesilcount++;
					System.out.println("매실차" + "+" + maesilcount);
					money -= maesil;
					System.out.println("소지금" + (money));
				}else {
					System.out.println("잔액이 부족합니다.");
				}
			}else if(menu == 0) {
				System.out.println("=== 소지품 목록 ===");
				System.out.println("소지금" + money + "원");
				System.out.println("콜라" + colacount + "개");
				System.out.println("사이다" + cidercount + "개");
				System.out.println("매실차" + maesilcount + "개");
			}else {
				System.out.println("그런 메뉴는 없습니다.");
			}
		}
	}
}
