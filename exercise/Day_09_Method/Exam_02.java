
public class Exam_02 {

	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	public static int mply(int num1, int num2){
		int result = num1 * num2;
		return result;
	}

	public static double divide(double num1, double num2){
		return (double)num1 / num2;
		// result로 만들지않고 바로 연산을 실행할수도 있다.
	}
	
	public static int bigger(int num1, int num2){
		if(num1>num2) {
			return num1;
		}else if(num1<num2) {
			return num2;
		}else {		// else if(num1 == num2)가 실행되지 않는 이유는 죄다 false가 되기때문. 
			return 0;
		}
	}
	
	public static void hello(){ // void는 리턴값이 없는 메서드 선언.
		System.out.println("Hello Java");
		System.out.println("2021-09-14(Tue)");
	}
	
	public static void exam(int num1, int num2){
		System.out.println(num1+num2);
	}

	public static void main(String[] args) {
		// 두 정수를 인자값으로 전달 받아, 뺄셈한 결과를 int로 return하는 minus 메서드 만들기.
		minus(5,1);
		System.out.println(minus(5,1));

		// 두 정수를 인자값으로 전달 받아, 곱셈한 결과를 int로 return하는 mply 메서드 만들기.
		mply(10,2);
		System.out.println(mply(10,2));

		// 두 정수를 인자값으로 전달 받아, 뺄셈한 결과를 double로 return하는 divide 메서드 만들기.
		divide(2.1, 3.5);
		System.out.println(divide(2.1, 3.5));
		
		// 두 정수를 인자값으로 전달 받아, 더 큰 수를 int로 return하는 bigger 메서드 만들기.
		// 단, 두 수가 같을 경우 0을 return.
		bigger(2,3);
		System.out.println(bigger(2,3));
		
		// 인자값이 없고, return값도 없는 hello메서드 만들기.
		// 메서드가 실행되면 "Hello Java"라고 출력.
		// 코드가 길거나, 자주 출력하는 내용을 메서드호출로 간편하게 사용할 수 있다.
		hello();
		
		// 출력한 것을 바로 호출해버릴 수도 있다. but 범용성은 떨어진다.
		exam(1,20);
	}
}
