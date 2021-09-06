import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
	
		String num = sc.nextLine(); // num은 String으로 받아진 상황.
		int result = Integer.parseInt(num); // num을 숫자로 분석하라는 명령. double quotaion을 빼버림.
		
		//int result = Integer.parseInt(sc.nextLine());
		//이러한 방법도 가능하다. 
        //sc.nextLine();에 입력값이 num으로 들어가고 result에 담기므로. 변수를 두개를 쓸 필요가 없어진다.
		
		System.out.println("더한 결과는 "+ (result+10));
	}
}