import java.util.Scanner;

public class Quiz_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]arr1 = new int[3];
		int input;
		int a;
		
		for(a=0; a<arr1.length; a++) {
			input = sc.nextInt();
			arr1[a]=input;
			System.out.println(a+1 + "번째 수 : " + arr1[a]);
		}
	}
}
