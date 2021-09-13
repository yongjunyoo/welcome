
public class Quiz_05_Teacher {
	public static void main(String[] args) {


		// 1~45 사이의 숫자를 중복되지않게 6개 뽑고 보너스 번호 1개를 더 뽑는 로또 시뮬레이터.
		// 총 7개의 숫자.
		// 오늘의 로또 번호 추천 프로그램.

		int[] lotto = new int[45];
		
		// 로또번호 초기화 1~45.
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		// 로또 번호 카드섞기.
		for(int i =0; i<lotto.length*100; i++) {
			int x = (int)(Math.random()*45);
			int y = (int)(Math.random()*45);
			int tmp = lotto[x];
			lotto[x] = lotto[y];
			lotto[y] = tmp;
		}
		// 추첨번호를 추천번호 배열에 복사.
		int[]rcmd = new int[6];
		for(int i=0; i<6; i++) {
			rcmd[i]=lotto[i];
		}
		
		// 번호 배열 정렬.
		for(int i=0; i<rcmd.length-1; i++) {
			for(int j=0; j<rcmd.length-1; j++) {
				if(rcmd[j]>rcmd[j+1]) {
					int tmp = rcmd[j];
					rcmd[j] = rcmd[j+1];
					rcmd[j+1] = tmp;
				}
			}			
		}

		System.out.print("오늘의 로또 추천번호 : ");
		for(int i=0; i<rcmd.length; i++) {
			System.out.print(rcmd[i]+" ");
		}
		System.out.println();
		System.out.println("보너스 번호 : " + lotto[6]);
	}
}