import java.util.Scanner;

public class Exam_03 {
	
	//double random(){
		// 난수 생성 코드.
		// 반환.
	//}
	
	//String nextLine(){
		// 버퍼를 확인하고 비어있으면 입력받는 기능, 안 비어있으면 데이터를 가져오는 기능.
		// 반환.
	//}
	
	//int parseInt(String str) {
		
	//}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine(); // nexLine()이 return을 갖고 String에다 담았음.
		int kor = Integer.parseInt(sc.nextLine());
		// nextLine() 메소드가 call됨. String값이 리턴됨. String값은 parseInt()의 파라미터가 됨.
		
		double rand = Math.random(); // random()이 return을 갖고 double에다 담았음.
	}
}
