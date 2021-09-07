import java.util.Scanner;

public class Quiz_08_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력 반복 횟수 : ");
		int num = Integer.parseInt(sc.nextLine());
		int a = 0;
		
		while(a<num) {
			a++;
			System.out.println(a + " : Hello Java");
		}
	}
}
