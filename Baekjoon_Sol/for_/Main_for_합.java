package for_;
import java.util.Scanner;

public class Main_for_합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//		int n = sc.nextInt();           풀지못했다...
		//		int a = 0;
		//		
		//		for(a = 0; a < n; a++) {
		//			a += a;
		//			System.out.println(a);

		int n = sc.nextInt();
		int sum = 0;
		for(int a = 1; a<=n; a++) {
			sum += a;		
		}
		System.out.println(sum);
	}
}
