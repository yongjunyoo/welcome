
public class Quiz_02 {
	public static void main(String[] args) {
		
		// int형 배열 100칸 짜리 arr1을 만들고, 1부터 100까지 저장해보세요.
		// 잘 저장해보세요 확인하는 방법.
		// arr[0] =1, arr1[99] =100이 나와야함.
		
		int[] arr1 = new int[100];
		
		for(int i=0; i<arr1.length; i++) { //arr1.length 배열의 길이.
			arr1[i] = i+1;
		}
		System.out.println(arr1[0]);
		System.out.println(arr1[99]);
		
		// int형 배열 100칸짜리 arr2를 만들고, 100부터 1까지 저장해보세요.
		
		int[]arr2 = new int[100];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = 100-i;
		}
		System.out.println(arr2[99]); // 1
		System.out.println(arr2[0]); // 100
		
		// char형 배열 26칸 짜리 arr3를 만들고, Z-A까지 저장해보세요.
		
		char[]arr3 = new char[26];
		
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = (char)('Z'-i); //char로 형변환해야함.
		}
		System.out.println(arr3[0]); // Z
		System.out.println(arr3[25]); // A
		
	}
}
