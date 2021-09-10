import java.util.Scanner;

public class Quiz_02_Random {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	

		int user;
		int com = (int)(Math.random() *(3-1+1)+1);

		while(true) {
		System.out.println("===  가위 바위 보 게임 ===");
		System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보) : ");
		
		while(true) {
			try {
				user = Integer.parseInt(sc.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("숫자를 입력해주세요.");
			}	
		}

			System.out.println("==== 결과 ====");
			if(user == 1 && com ==1) {
				System.out.println("당신은 가위를 냈습니다." );
				System.out.println("컴퓨터는 가위를 냈습니다.");
				System.out.println("비겼습니다.");
			}else if(user == 1 && com ==2) {
				System.out.println("당신은 가위를 냈습니다." );
				System.out.println("컴퓨터는 바위를 냈습니다.");
				System.out.println("컴퓨터가 이겼습니다.");
			}else if(user == 1 && com ==3) {
				System.out.println("당신은 가위를 냈습니다." );
				System.out.println("컴퓨터는 보를 냈습니다.");
				System.out.println("플레이어가 이겼습니다.");
			}else if(user == 2 && com ==1) {
				System.out.println("당신은 바위를 냈습니다." );
				System.out.println("컴퓨터는 가위를 냈습니다.");
				System.out.println("플레이어가 이겼습니다.");
			}else if(user == 2 && com ==2) {
				System.out.println("당신은 바위를 냈습니다." );
				System.out.println("컴퓨터는 바위를 냈습니다.");
				System.out.println("비겼습니다.");
			}else if(user == 2 && com ==3) {
				System.out.println("당신은 바위를 냈습니다." );
				System.out.println("컴퓨터는 보를 냈습니다.");
				System.out.println("컴퓨터가 이겼습니다.");
			}else if(user == 3 && com ==1) {
				System.out.println("당신은 보를 냈습니다." );
				System.out.println("컴퓨터는 가위를 냈습니다.");
				System.out.println("컴퓨터가 이겼습니다.");
			}else if(user == 3 && com ==2) {
				System.out.println("당신은 보를 냈습니다." );
				System.out.println("컴퓨터는 바위를 냈습니다.");
				System.out.println("플레이어가 이겼습니다.");
			}else if(user == 3 && com ==3) {
				System.out.println("당신은 보를 냈습니다." );
				System.out.println("컴퓨터는 보를 냈습니다.");
				System.out.println("비겼습니다.");
			}
		}
	}
}
