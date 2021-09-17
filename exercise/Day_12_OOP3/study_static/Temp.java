package study_static;

public class Temp {
//	public int a;			// 인스턴스 멤버필드. 인스턴스 생성후 사용가능.
//	public static int b;	// 클래스 멤버필드. 메인메서드와 실행.
	
	public static void main(String[] args) {

		Calc c = new Calc();
		
		System.out.println(c.plus(10,5)); // 15
		System.out.println(Calc.minus(10,5)); // 5
	}
}