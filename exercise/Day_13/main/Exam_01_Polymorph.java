package main;

class A{
	public void funcA() {
		System.out.println("funcA입니다.");
	}
}

class B extends A{
//	public void funcB() {
	public void funcA() { // 오버라이딩
		System.out.println("funcB입니다.");
	}
}

class C extends A{

}

public class Exam_01_Polymorph {
	public static void main(String[] args) {

		// 다형성 : 클래스 간 상속 관계에서만 발현되어 서로 다른 타입의 값을 가질 수 있는 성질.
		// 규칙 : 상위 클래스 참조변수는 자신을 상속받는 하위 클래스 인스턴스의 주소를 저장할 수 있다.

		// 코드결합도가 높은 것을 해결하는 것.(많을다 多 형상형 形 성품성 性). 
		// 나라는 본질은 하나인데 다양한 형태로 변신 가능한 것.
		// ex) int형 변수인데 String도 boolean도 담는 것.

		//	A a = new A();
		//	B b = new B();

		// 만약 이러면 에러 발생.
		// A a = new B();
		// B b = new A();

		// but. B가 A에게 상속 받으면
		//  A a = new A();
		A a = new B(); // 업캐스팅... 자료형, 변수, 인스턴스 생성.
		//	a = new C();
		a.funcA(); // 겉모습은 바뀌었으나 기능은 사용하지 못함. 변수의 자료형에 맞춰 동작하기 때문.
		// 오버라이딩되면 예외상황으로 funcB로 실행함.
		// ((B)a).funcB(); // 다운캐스팅(상위클래스를 하위클래스로 형변환)을 통해 기능을 사용할 수 있음.
	}
}