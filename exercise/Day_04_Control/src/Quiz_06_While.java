
public class Quiz_06_While {
	public static void main(String[] args) {
		//		int a = 101;
		//		while(a < 102 && a > 1) {           이렇게도 할수있지만 아래 코딩이 더깔끔하다.
		//			a--;
		//			System.out.println(a);
		int a = 100;
		while(a > 0) {
			System.out.println(a--);
		}
	}
}