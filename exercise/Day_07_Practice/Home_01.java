import java.util.Scanner;

public class Home_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu; // 메뉴 선택.
		int select; // 배팅하는 말.
		int bat; // 배팅 금액.
		int input; // 충전 금액.
		int remain = 0; // 잔액.

		while(true) {
			while(true) {
				try {
					System.out.println("경마 게임에 오신 것을 환영합니다.");
					System.out.println("1. 게임 시작");
					System.out.println("2. 잔액 충전");
					System.out.println("3. 잔액 조회");
					System.out.println("4. 게임 종료");
					System.out.print("메뉴를 선택해주세요.");
					menu = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("숫자를 입력해 주세요.");
				}	
			}

			int winnerhorse = (int)(Math.random() * (3-1+1)+1); // 승리 말 번호.

			if(menu == 1) {
				while(true) {
					try {
						System.out.println("경마 게임에 오신 것을 환영합니다.");
						System.out.println("승리마는 : " + winnerhorse);
						System.out.println("1. 우승 경력이 많지만 은퇴를 앞둔 말");
						System.out.println("2. 이번달 성적이 제일 좋은 말");
						System.out.println("3. 최근 떠오르는 신예인 말");
						System.out.print("배팅하고 싶은 말을 선택해주세요. : ");
						select = Integer.parseInt(sc.nextLine()); // 배팅하는 말.
						System.out.print("얼마를 배팅하시겠습니까? : ");
						bat = Integer.parseInt(sc.nextLine());
						if(bat>remain) {
							System.out.println("잔액이 부족합니다.");
							break;
						}else {
							System.out.println(bat + " 원이 배팅되었습니다.");
							if(select == winnerhorse) {
								System.out.println("배팅금액의 2배를 획득하셨습니다.");
								remain=remain*2;
								break;
							}else {
								System.out.println("배팅금액 "+ bat +"원을 잃으셨습니다.");
								remain-=bat;
								break;
							}
						}
					}catch(Exception e) {
						System.out.println("숫자를 입력해 주세요.");
					}
				}

			}else if(menu == 2) {
				while(true) {
					try {
						System.out.print("얼마를 충전하시겠습니까? : ");
						input = Integer.parseInt(sc.nextLine());
						remain += input;
						break;
					}catch(Exception e) {
						System.out.println("숫자를 입력해 주세요.");
					}		
				}
			}else if(menu == 3) {
				System.out.println("현재 잔액은 " + remain + "원 입니다.");
			}else {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		}
	}
}