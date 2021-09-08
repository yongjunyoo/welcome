import java.util.Scanner;

public class Quiz_01_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.print("숫자 입력 : ");
			int input = Integer.parseInt(sc.nextLine());
			if(input == 0) {
				break;
			}
			sum += input;
		}
		System.out.println("숫자의 합은 : " + sum);
	}
}