
public class Quiz_03 {
	public static void main(String[]ar){
		
		int i1 = 10;
		int i2 = 20;
		float f1 = 3.14f;
		char c1 = 'A';
		char c2 = 'B';
	
	System.out.println("결과 : " + i1 + i2); // 괄호가 없으니 “결과 : ” + i1부터 연산한 뒤, + i2 연산.
	System.out.println("결과 : " + (i1 + i2));
	System.out.println("결과 : " + i1 + f1);
	System.out.println("결과 : " + (i1 + f1));
	System.out.println("결과 : " + i1 + c1);
	System.out.println("결과 : " + (i1 + c1));
	System.out.println("결과 : " + c1 + c2); // 괄호가 없으니 좌측 +부터 연산하기에 문자로 연산값 나옴.
	System.out.println("결과 : " + (c1 + c2));
	}
}