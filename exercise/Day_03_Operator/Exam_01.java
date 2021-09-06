
public class Exam_01 {
	public static void main(String[] args) {
	
		int a = 10;
		// 5 = 20; 오류발생. 좌항에서 우항으로 대입한다. 변수는 좌항에 있어야 한다.
		
		int b = 20;
		a += b; // a = a+b
		System.out.println(a);
		System.out.println(b);
		
		int c = 10;
		System.out.println(c++); // 연산이 끝나고 +1이기에 출력시 10이 출력됨.
		System.out.println(c); // 다음 연산이기에 +1
		
		int d = 10;
		System.out.println(++d); // 바로 11출력.
		
		int e = 10;
		int f = 20;
		System.out.println(e==f); // 관계연산자는 출력이 숫자가 아니라 true/false로 나옴.
		System.out.println(e!=f); // !는 not의 개념.
		System.out.println(e<f && e<f); // 논리연산자는 true/false를 논함. &&는 둘다 true일때 true.
		System.out.println(e>f || e<f); // ||는 하나만 true여도 true.
		System.out.println(e==f && e!=b); // shortcut연산의 특징을 가짐. 앞이 f이면 뒤의 연산실행 x
		System.out.println(e<f || e!=b); // shortcut연산의 특징을 가짐. 앞이 t이면 뒤의 연산실행 x
}
}
