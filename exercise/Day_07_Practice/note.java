import java.util.Scanner;

public class note {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("== Up&Down Game ==" + "\n");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print(">>");
			int menu = Integer.parseInt(sc.nextLine());

			int bestrecord = 0;
			if(menu == 1) {
				System.out.println("<< Game Start >>");
				int random = (int)((Math.random() * (99-1+1)+1));
				System.out.println("정답 : " + random);

				while(true) {
					System.out.print("Input Number : ");
					int input = Integer.parseInt(sc.nextLine());
					if(input == random){
						System.out.println("<< 정 답 >>");
						input++;
						break;
					}else if(input > random){
						System.out.println("<< D O W N >>");
						input++;
					}else {
						System.out.println("<< U P >>");
						input++;
					}
				}
			}else if(menu == 2) {
				System.out.println("현재 최고기록은" + bestrecord + " 입니다.");
			}else if(menu == 3) {
				System.out.println("게임을 종료합니다.");
			}
		}
	}
}