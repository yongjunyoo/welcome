
public class Exam_03 {
	public static void main(String[] args) {

		// SWAP기법. 배열에서 유용함.
		
		int a = 10;
		int b = 20;
		
		int tmp;
		tmp = a;
		a = b;
		b = tmp;
		// a와 b의 값이 교환됨.
		
		int[] arr = new int[] {10,20};
		tmp = arr[0];
		arr[0]=arr[1];
		arr[1]=tmp;
		
		System.out.println(arr[0] +" "+ arr[1]);
		
	}
}