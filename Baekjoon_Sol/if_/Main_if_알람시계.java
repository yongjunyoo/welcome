package if_;
import java.util.Scanner;

public class Main_if_알람시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
//		if(H>=0 && H<=23 && M>=0 && M<=59){                이거 못풀었다...
//			System.out.println(H + " " +  (M-45));
		
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}else{
			System.out.println(H + " " + (M - 45));
		}
	}
}
