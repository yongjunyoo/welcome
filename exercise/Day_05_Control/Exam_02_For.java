
public class Exam_02_For {
	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				break;  // i가 5일때 반복문 탈출해버림.
			}
			System.out.println("i : " + i);
		}
		
		for(int a = 1; a <=10; a++) {
			if(a == 5) {
				continue; // a가 5일때 sysout하지 않고 다시 반복문으로 돌아간다.
			}
			System.out.println("a : " + a);
		}
	}
}