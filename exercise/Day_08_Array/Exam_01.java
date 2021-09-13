import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		
//		int a;
//		int b;
//		int c;
//		int d; // 변수를 대량으로 생성할때는 하나하나 다 선언 해주어야 한다.
		
//		int[] arr;  // 배열 사용을 위한 첫 번째 문법. 
					// : heap메모리에 생성되는 배열의 주소를 저장할 참조변수 생성
				    // 배열을 저장하기 위한 참조변수를 만들었다.
		
//		new int[4]; // 배열 사용을 위한 두 번째 문법. : 실질적인 배열을 heap에다가 생성하는 문법.
					// 주소값이 생성되고 반환된다.
		int[] arr1 = new int[4];
		// new int[4]에 생성된 주소값이 in[] arr에 반환된다.
		// ㅁ ㅁ ㅁ ㅁ
		//[0][1][2][3]
		arr1[0] =10; // ----> 10 ㅁㅁㅁ
		arr1[1] =20; // ----> 10 20 ㅁㅁ
		arr1[2] =30; // ----> 10 20 30 ㅁ
		arr1[3] =40; // ----> 10 20 30 40
					// 배열의 index/첨자 cf) offset : 기준점으로부터 얼마나 떨어졌는가?
		// arr[4] =50; 배열의 index/첨자 번호가 잘못되어서 ArrayIndexOutOfBoundsException발생. 
		System.out.println((arr1[0]) + (arr1[1]) + (arr1[2]) + (arr1[3]));
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr2 = new int[] {10,20,30,40};
		
		int a = 2;
		int b = sc.nextInt();
		
		System.out.println((arr2[1]) + (arr2[a]) + (arr2[sc.nextInt()]) );
		
		// 배열을 생성할 때, 초기값을 넣을거면 사이즈를 넣으면 안됨.
		// 배열을 생성할 때, 사이즈를 넣을거면 초기값을 넣으면 안됨.
		
		int[]arr3 = new int[] {10,20,30,40};
		
		for(int i=0; i<4; i++) {
			System.out.println(arr3[i]);
		}
	}
}
