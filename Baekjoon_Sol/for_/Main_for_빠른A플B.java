package for_;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main_for_빠른A플B {
	public static void main(String[] args) throws IOException{
		//		Scanner sc = new Scanner(System.in);  시간초과 뜸... Scanner가 아닌 Bufferd클래스 사용...
		//		
		//		int T = sc.nextInt();
		//		
		//		for(int i = 0; i<T; i++) {
		//			int a = sc.nextInt();
		//			int b = sc.nextInt();
		//			System.out.println(a+b);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
		}
		br.close();

		bw.flush();
		bw.close();
		
		// BufferedReader는 입력받은 값을 Enter로 경계, String으로 고정.
		//br.readLine();

		// StringTokenizer는 String을 Token(문자열 조각)으로 분리.
		// (br.readLine(), " ", true); 라고 한다면 띄어쓰기를 구분하고 true(띄어쓰기도 포함하여 출력.)
		// hasMoreTokens(); 보통 while과 함께씀. 다음 토큰이 있을 때 true 리턴. 없으면 false 리턴
		// nextToken(); 객체에서 다음 토큰을 반환.
		// countTokens(); 총 토큰의 개수를 리턴.
		
		//bw.write(); 바로 출력되는 것이 아니라 받아놨다가 한방에 보내줌.
		//bw.newLine(); 줄바꿈.
		//bw.flush(); buffer를 비워냄. 즉, 남아있는 데이터를 모두 출력시킴.
		//bw.close(); 닫아버림.

	}
}