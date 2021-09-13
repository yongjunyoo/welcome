
public class Quiz_05 {
	public static void main(String[] args) {


		// 1~45 사이의 숫자를 중복되지않게 6개 뽑고 보너스 번호 1개를 더 뽑는 로또 시뮬레이터.
		// 총 7개의 숫자.
		// 오늘의 로또 번호 추천 프로그램.

		int[] arr = new int[45];

		for(int k=0; k<arr.length; k++) {
			arr[k] = k+1;
		}

		for(int k=0; k<arr.length*100; k++) {
			int x = (int)(Math.random()*45);
			int y = (int)(Math.random()*45);
			int tmp = arr[x];
			arr[x] = arr[y];
			arr[y] = tmp;
		}
		System.out.println("오늘의 로또 번호는 : ");
		for(int k=0; k<6; k++) {
		System.out.println(arr[k] + "");
		}
		System.out.println("보너스 번호는 : " + arr[6]);
	}
}
