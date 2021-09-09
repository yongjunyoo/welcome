import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int 합계 = 0;
		while(true) {
			System.out.println("*** ATM 시뮬레이터 ***");
			System.out.println("1. 잔액조회");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 종료하기");
			System.out.print(">>");
			int 선택 = Integer.parseInt(sc.nextLine());

			if(선택 == 4) {
				System.out.println("ATM 시뮬레이터를 종료합니다.");
				break;
			}
			if(선택 == 1 || 선택 == 2 ||선택 == 3 ||선택 == 4) {
				if(선택 == 3) {
					System.out.println("얼마를 출금하시겠습니까?");
					System.out.print(">>");
					int 출금하기 = Integer.parseInt(sc.nextLine());
					합계 -= 출금하기;
				}else if(선택 == 2) {
					System.out.println("얼마를 입금하시겠습니까?");
					System.out.print(">>");
					int 입금하기 = Integer.parseInt(sc.nextLine());
					합계 += 입금하기;
				}else {
					if(합계 < 0) {
						System.out.println("현재 보유 잔액은 0원 입니다.");
					}else {
						System.out.println("현재 보유 잔액은" + 합계 + "원 입니다.");	
					}
				}
			}else{
				System.out.println("그런 선택은 없습니다.");
			}
		}
	}
}

