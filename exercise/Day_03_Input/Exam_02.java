import java.util.Scanner; // import java.lang*;과 같이 불러오는것. ctrl+shift+o하면 자동 import.
public class Exam_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// System.in.read(); 는 한글자만 int형으로 입력받는다.
		System.out.println("남길 메세지를 입력해주세요.");
		String a = sc.nextLine(); // 한 라인을 String형으로 입력받는다. nextline()은 buffer를 비우는 효과.
		System.out.println("입력한 메세지는 : " + a);
		
		int b = sc.nextInt();
		System.out.println("입력받았습니다 : " + b);
	}
}
