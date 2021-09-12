package for_;
import java.util.Scanner;

public class Main_for_N찍기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		for(int a=1; a<=N; a++) {
			System.out.println(a);
		}
	}
}