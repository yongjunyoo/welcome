
public class Quiz_09_While {
	public static void main(String[] args) {

		int a = 0;

		while(a < 100) {
			a++;
			System.out.print(a + " ");

			if(a%10 == 0) {
				System.out.println();
			}
		}
	}
}
