
public class Exam_01 {
	public static void main(String[] args) {
		int a = 20;
		System.out.println("a값은 : " + a);
		// 큰지역인 main { }에서 변수를 선언했으면 ‘가’지역에서는 같은 변수선언이 불가능하나, 변수의 사용은 가능하다.

		// 가 - 지역 {
		//          int a = 10;
		//          System.out.println("a값은 : " + a); 
		//          }
		
		
		
		// 나 - 지역 {
		//          int a = 15;
		//         }
		//         System.out.println("a값은 : " + a); 
		// main 내에 앞서 변수 선언한 것 없이 '나' 지역에서 변수를 선언했을 때,
		// '나' 지역 바깥에서 변수의 사용은 불가능하다.
	
	}
}
