import java.util.Scanner;

public class Exam_04_Switch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과일을 선택하세요.");
		System.out.println("1.망고  2.포도  3.바나나");
		System.out.println(">>");
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1 : 
			System.out.println("망고를 고르셨습니다.");
			break; // 경우의 수를 나눠주는 칸막이 역할.
		case 2 : 
			System.out.println("포도를 고르셨습니다.");
			break;
		case 3 : 
			System.out.println("바나나를 고르셨습니다.");
			break;
		default : // if문의 else와 같은 기능.
			System.out.println("그런 메뉴는 없습니다.");
		}
	}
}
