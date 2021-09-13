import java.util.Scanner;
public class Exam_04_Bubblesort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[]arr = new int[] {38,22,19,5};

		System.out.println("정렬 전 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		//		// 1회차.
		//		if(arr[0]>arr[1]) {
		//			int tmp;
		//			tmp = arr[0];
		//			arr[0]=arr[1];
		//			arr[1]=tmp;
		//		}
		//		if(arr[1]>arr[2]) {
		//			int tmp;
		//			tmp = arr[1];
		//			arr[1]=arr[2];
		//			arr[2]=tmp;
		//		}
		//		if(arr[2]>arr[3]) {
		//			int tmp;
		//			tmp = arr[2];
		//			arr[2] = arr[3];
		//			arr[3]=tmp;
		//		}
		//		// 2회차.
		//		if(arr[0]>arr[1]) {
		//			int tmp;
		//			tmp = arr[0];
		//			arr[0]=arr[1];
		//			arr[1]=tmp;
		//		}
		//		if(arr[1]>arr[2]) {
		//			int tmp;
		//			tmp = arr[1];
		//			arr[1]=arr[2];
		//			arr[2]=tmp;
		//		}
		//		if(arr[2]>arr[3]) {
		//			int tmp;
		//			tmp = arr[2];
		//			arr[2] = arr[3];
		//			arr[3]=tmp;
		//		}
		//		// 3회차.
		//		if(arr[0]>arr[1]) {
		//			int tmp;
		//			tmp = arr[0];
		//			arr[0]=arr[1];
		//			arr[1]=tmp;
		//		}
		//		if(arr[1]>arr[2]) {
		//			int tmp;
		//			tmp = arr[1];
		//			arr[1]=arr[2];
		//			arr[2]=tmp;
		//		}
		//		if(arr[2]>arr[3]) {
		//			int tmp;
		//			tmp = arr[2];
		//			arr[2] = arr[3];
		//			arr[3]=tmp;
		//		}
		// 요소가 4개일 때, 3회 정렬을 3번 반복해야함. 요소n, n-1회 n-1반복

		// 반복문을 활용해서 나타낸다면.
		for(int j=0; j<arr.length-1; j++) {
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					int tmp;
					tmp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
				}
			}
		}
		System.out.println("정렬 후 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}