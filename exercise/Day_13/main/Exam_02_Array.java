package main;

public class Exam_02_Array {
	public static void main(String[] args) {

		// 입력.
		String[] arr = new String[3];
		arr[0] = "Hello";
		arr[1] = "Java";
		arr[2] = "World";

		// 출력.
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("==========");

		// 삭제.
		// arr[0]을 지우고 빈칸에 뒤에 것을 땡겨옴.
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = null;

		// 삭제 후 출력.
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("==========");

		// 삽입.(끼워넣기.)
		arr[2] = arr[1];
		arr[1] = arr[0];
		arr[0] = "Good";

		// 삽입 후 출력.
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("==========");
	}
}
