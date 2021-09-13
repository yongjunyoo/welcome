import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x,y,z;

		System.out.print("1 번째 수 : ");
		x = sc.nextInt();
		System.out.print("2 번째 수 : ");
		y = sc.nextInt();
		System.out.print("3 번째 수 : ");
		z = sc.nextInt();

		System.out.println("1 번째 수 : " + x);
		System.out.println("2 번째 수 : " + y);
		System.out.println("3 번째 수 : " + z);


		int[]arr1 = new int[3];

		for(int a=0; a<arr1.length; a++) {
			System.out.print(a+1 + "번째 수 : ");
			arr1[a]=sc.nextInt();
		}
	}
}
