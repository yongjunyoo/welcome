
public class Quiz_01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(++a == 10 && b++ == 20); //shortcut의 아주 좋은 예. 앞이 fasle라 뒤는 실행 x
		System.out.println(a +  " : " + b);
	}
}