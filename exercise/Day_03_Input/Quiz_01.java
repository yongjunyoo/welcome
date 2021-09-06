import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		
		System.out.println("작성자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String writer = sc.nextLine();
		
		System.out.println("남길 메세지를 입력해주세요.");
		String message = sc.nextLine();
		System.out.println(writer + " 님이 남긴 메세지.\n" + message);
	}
}