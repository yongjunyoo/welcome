
public class Exam_05_Random {
	public static void main(String[] args) {

		// 중복되지 않는 수를 만드는 방법.

		System.out.println((int)((Math.random()*(5-1+1)+1)));
		System.out.println((int)((Math.random()*(5-1+1)+1)));
		System.out.println((int)((Math.random()*(5-1+1)+1)));

		// 배열을 이용하여 중복방지함(수를 기억해놓기위해). + 중복for문.

		// 1~5 사이의 중복되지 않는 난수 3개 만들기!

		int[]arr = new int[] {1,2,3,4,5};

		//카드섞기 알고리즘.

		for(int i=0; i<arr.length*100; i++) {
			int x = (int)(Math.random() *5); // 0~4의 숫자.
			int y = (int)(Math.random() *5); // 0~4의 숫자.

			int tmp = arr[x];
			arr[x] = arr[y];
			arr[y] = tmp;
		}
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]); // 중복없어진 난수.
	}
}