
public class Exam_05 {
public static void main(String[] args) {

	// 변수 : 변할 수 있는 수.
	int a = 10;
	a = 50;
	
	// 상수 : 항상 같은 수. final 키워드는 상수로 지정한다.
	final int b = 10;
	// b = 50;은 에러가 발생한다.
	
	final double PI = 3.14; 
	// 이러한 경우는 상수로 지칭한다. why? 파이는 변하지않음. 상수는 대문자로 하는 것이 관습.
	
//	   cf) int a = 10;에서
//	   int는 자료형, a는 변수명, =은 대입연산자, 10;은 Literal상수
	
	int i = 100;
	long l = 100L;
	final byte ON = 1;
	// Literal : 100, 100L, 1
	// 변수 : i, l
	// 상수 : ON;
	// 예약어 : public class, public static void main(String[] args), int, long, final byte
}
}
