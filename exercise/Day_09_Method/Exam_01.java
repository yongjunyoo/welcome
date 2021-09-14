
public class Exam_01 { // Startup 기업 Exam_01이라 가정.
		// 메서드는 메인바깥에 만든다는게 기본.
	
	 public static int plus(int num1, int num2){ // 메서드 정의부. 괄호 안에 매개변수(Parameter) 전달.
		 int result = num1+num2;			     // 메서드 이름 옆에 자료형 선언.
		 return result;			                 // 인수/인자/Parameter를 받아옴.
		// 1. 메서드 종료.                          // 받아올 파라미터의 자료형과 이름 선언하며 콤마로 구분.
		// 2. 값을 Caller(main)에게 전달한다.
		 
	}
	
	public static void main(String[] args) { // main 사장님.
		System.out.println(10+5);
		//printlne()은 메소드. 덧셈도 메서드이지만 기능이 분할되어있지 않음.
		plus(10,5); // 직원 호출. 소괄호를 치고 값을 전달. plus(10,5);는 메서드 호출부.
				    // 어떤 키워드 뒤에 소괄호는 메서드. - plus()
				    // 괄호안에 넣는 10,5는 인수/인자/Parameter
		
		double rand = Math.random(); // 0~1 사이의 double값. 내장메서드.
		
		// ----> main에서 시작 -> 메서드 콜 -> 메서드 리턴값을 plus에 15반환하고 종료.
		// plus(10,5)는 15이다. plus(10,5)+1=16이 된다.
		System.out.println(plus(10,5));
		// 유지보수 유리, 에러검출 용이, 팀플레이 유리, 재활용성 높음
	}
}