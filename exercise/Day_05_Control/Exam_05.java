import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		
		char c = 'A';
		char d = 'A';
		System.out.println(c == d);
		
		String e = "Hello";  // 안의 Hello가 같다고 같은 개념이 아님. Stack이 아닌 Heap에 저장.
		String f = "Hello";  // e와 f의 주소값이 같기 때문에 true가 나옴.
		String g = new String("Hello"); // g는 Heap에 다르게 저장되기에 앞의 Hello와 주소값이 다름.
		System.out.println(e == f);
		System.out.println(f == g);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메세지를 입력하세요.");
		String msg = sc.nextLine();
		
//		if(msg == "Apple") {
//			System.out.println("입력된 단어는 사과입니다."); 이러한 경우는 입력값이 같다고 보지않는다.
		if(msg.equals("Apple")) { // 자바에서 문자열 간 비교는 ==을 사용해선 안된다.
			                      // 자바에서 문자열 간 비교는 .equals 기능을 사용해야한다.
			System.out.println("입력한 단어는 사과입니다.");
		}
	}
}
