
public class Exam_03 {
	public static void main(String[] args) {
		byte a = 10;
		short b = a;
		System.out.println(a+b);
		
		int c = 10;
		int d = 4;
		double e = 4;
		System.out.println(c/d); // int형이기에 정수가 출력.
		System.out.println(c/e); // double형으로 소수점 출력가능.
		
		double f = 10.12;
		int g = (int)f; // double형이 int형으로 명시적 형변환.
		System.out.println(g);
		
		int h = 10;
		System.out.println("변수 a안에 저장되는 값은 " + a + "입니다.");
	}

}
