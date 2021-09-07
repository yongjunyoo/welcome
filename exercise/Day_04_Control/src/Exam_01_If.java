import java.util.Scanner;

public class Exam_01_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신이 좋아하는 과일을 선택하세요.");
		System.out.println("1. 사과");
		System.out.println("2. 포도");
		System.out.println("3. 복숭아");
		System.out.println(">>");		
		
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			System.out.println("사과를 선택하셨습니다.");			
		}else if(menu == 2){
			System.out.println("포도를 선택하셨습니다.");
		}else if(menu == 3){
			System.out.println("복숭아를 선택하셨습니다.");
		}else {
			System.out.println("그런 메뉴는 없습니다.");
		}
	}

}
