
public class Exam_02 {
	public static void main(String[] args) {
		byte a; // 컴퓨터 a라는 이름으로 ram에다 변수를 하나 만듦.(숫자 저장, 사이즈는 1byte.)
		a = 127; // 1bit = 2^1 -> 2개의 숫자 표현 가능. 0,1
		         // 1byte = 2^8 -> 256개의 숫자 표현 가능. -128 ~ 0 ~ 127
		byte b = -1; // 한 줄로 칠 수도 있음.
		b = -128; // 나중에 변수를 초기화한 것이 값이 됨.
		short c = 32767; // 2^16
		int d = 100000000; // 2^32 -> 가장 많이 쓰이는 자료형.
		long e = 1000000000000000L; // 2^64 -> long형은 L을 붙여줘야 한다. why? java는 int까지 보통 인식.
		char f = 'A'+1; // 아스키코드 A는 65, a는 97, char는 음수 갖지 못함.
		char g = 65;
		float h = 3.14F; // float형은 자동적으로 double로 인식하기에 F를 붙여줘야한다.
		double i = 3.1414; // 가장많이하는 실수형.
		boolean j = true; // true or false만 저장가능.
		String k = "\"Hello\"";
		
		System.out.println(a); // system.out.println("a");의 출력값은 a.
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}