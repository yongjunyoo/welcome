import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {

		// Math.random();
		// (int)(Math.random() * (X-Y+1) +Y)

		Scanner sc = new Scanner(System.in);
		
		double ht = (int)(Math.random() *(2-1+1)+1);
		int num;
		
		while(true) {
			System.out.println("=== 동전 앞 뒤 맞추기 ===");
			System.out.print("숫자를 입력해 주세요 (1.앞면/2.뒷면) : ");
			while(true) {
				try {
					num = Integer.parseInt(sc.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("숫자를 정확히 입력해주세요.");
				}	
			}

			if(num == ht) {
				System.out.println("맞췄습니다. ^^");	
			}else {
				System.out.println("땡! 틀렸습니다!");	
			}
		}
	}
}
