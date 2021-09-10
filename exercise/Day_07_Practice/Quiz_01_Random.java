import java.util.Scanner;

public class Quiz_01_Random {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("=== 동전 앞/뒤 맞추기 ===");

			int com = (int)(Math.random()*(2-1+1)+1);
			//System.out.println("동전 난수 : " + com);

			System.out.println("1.앞면 / 2. 뒷면");
			System.out.print(">>");
			int select = sc.nextInt();

			if(com == select) {
				System.out.println("맞췄습니다!");
			}else {
				System.out.println("틀렸습니다");
			}
		}
	}
}
