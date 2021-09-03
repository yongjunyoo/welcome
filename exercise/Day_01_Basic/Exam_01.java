import java.lang.*; // java.lang 안에 있는 *(모든 것)을 import(불러와줘). 암묵적이기에 안써도됨.
public class Exam_01 
{
	public static void main(String[] ar) 
	// 초기 실행위치, public static void main(String[] 까지... ar은 변수명.
	{
		System.out.println("\"Hello world\""); 
		// println은 줄바꿈, print는 줄안바꿈.
		// \ 역슬래쉬는 이스케이프하고싶은 곳 앞에서 쓰임.
		System.out.print("Java"); // ; 세미콜론은 마무리 지을 때.
		System.out.println("Practice"); // 문자열은 쌍따옴표 "" 
		System.out.println(100); // 숫자를 출력할때는 따옴표를 사용하지 않음.
		System.out.println('A'); // 문자는 작은따옴표 ''
		System.out.println(3.14);
		
		System.out.println("500"+5); // 숫자이지만 큰따옴표를 썼기에 문자열로 처리함.
		System.out.println("A8"+5); // 숫자이지만 큰따옴표를 썼기에 문자열로 처리함.
		/**/ // ----> /**/은 여러줄을 주석, //은 한 줄 주석.

		// {} 중괄호는 범위지정자
		// convention : 관습 관례
		
        // K&R Style (가장 자주쓰임.)
		
        // public class Exam_01 {
        //  public static void main(String[] args) {
        //				
        //  }
        // }
	}
}