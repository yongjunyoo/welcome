
public class Exam_05_Overloading {
	
	// 메서드 오버로딩.
	
	public static void func(int a) {
		System.out.println("func1() 입니다.");
	}
	
	public static void func(String a) {
		System.out.println("func2() 입니다.");
	}
	public static void func() {
		System.out.println("func3() 입니다.");
	}
	
	public static void main(String[] args) {

		func(10);
		func("굿");
		func();
	}
}