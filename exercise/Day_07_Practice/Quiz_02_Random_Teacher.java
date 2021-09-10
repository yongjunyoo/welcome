import java.util.Scanner;

public class Quiz_02_Random_Teacher {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	

		int user;
		
		while(true) {
			System.out.println("===  가위 바위 보 게임 ===");
			System.out.println("숫자를 선택하세요(1.가위/2.바위/3.보) : ");
			System.out.print(">>");
			
			while(true) {
				try {
					user = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("메뉴를 확인하고 다시 입력해주세요.");
				}
			}
			int com = (int)(Math.random() * (3-1+1)+1);

			switch(user) {
			case 1 : 
				System.out.println("플레이어는 가위를 냈습니다.");
				break;
			case 2 :
				System.out.println("플레이어는 바위를 냈습니다.");
				break;
			case 3 : 
				System.out.println("플레이어는 보를 냈습니다.");
				break;
			}
			switch(com) {
			case 1 : 
				System.out.println("플레이어는 가위를 냈습니다.");
				break;
			case 2 :
				System.out.println("플레이어는 바위를 냈습니다.");
				break;
			case 3 : 
				System.out.println("플레이어는 보를 냈습니다.");
				break;
			}
			if((user == 1 && com == 3) || (user == 2 && com == 1) || (user ==3 && com == 2)) {
				System.out.println("플레이어가 이겼습니다.");
			}else if((user == 1 && com == 2) || (user == 2 && com == 3) || (user ==3 && com == 1)) {
				System.out.println("컴퓨터가 이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}
	}
}