import java.util.Scanner;

public class Home_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		
		System.out.println("국어 점수를 입력해주세요.");
		int korean = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수를 입력해주세요.");
		int english = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수를 입력해주세요.");
		int math = Integer.parseInt(sc.nextLine());
		
		double sum = (korean + english + math);
		double avg = ((korean + english + math) / 3);
		
		System.out.println("===========");
		System.out.println("이름 : " + name);
		System.out.println("===========");
		System.out.println("국 어 : " + korean);
		System.out.println("영 어 : " + english);
		System.out.println("수 학 : " + math);
		System.out.println("===========");
		System.out.println("합 계 : " + sum);
		System.out.println("평 균 : " + avg);
		System.out.println("===========");
	}
}
