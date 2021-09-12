package for_;
import java.util.Scanner;

public class Main_for_기찍N {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		for(int a=N; a<=N && a>0; a--) {
			System.out.println(a);
		}
	}
}
