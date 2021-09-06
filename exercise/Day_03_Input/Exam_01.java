
public class Exam_01 {
	public static void main(String[] args) throws Exception{
	
		//System.out.println("Hello world"); //화면에 무언가를 출력하세요.
		
		//System.in.read(); // 프로그램 사용자로부터 한글자의 입력을 받으세요. ASDF를 입력하면 a만 똑 떼감.
		                  // 그 값(A)이 System.in.read();가 A로 바뀜.
		                  // System.in.read();에 들어가는 값은 int형으로 바뀜.
		
		//int num = System.in.read();
		//System.out.println("입력받은 문자의 10진 값은 : " + num);
		
		//System.out.println("문자를 한 글자 입력하세요.");
		//int num = System.in.read();
		//System.out.println("입력받은 문자는 : " + (char)num);
		
		System.out.println("문자를 한 글자 입력하세요.");
		int num1 = System.in.read();
		System.out.println("입력받은 문자는 : " + num1);  // Buffer에 있는 A 가져옴.
		
		System.out.println("문자를 한 글자 입력하세요.");
		int num2 = System.in.read();
		System.out.println("입력받은 문자는 : " + num2);  // Buffer에 있는 \r 가져옴.
		
		System.out.println("문자를 한 글자 입력하세요.");
		int num3 = System.in.read();
		System.out.println("입력받은 문자는 : " + num3); // Buffer에 있는 \n 가져옴.
		
		System.out.println("문자를 한 글자 입력하세요.");
		int num4 = System.in.read();
		System.out.println("입력받은 문자는 : " + num4); // Buffer에 있는 값을 소진하였기에 다시 처음부터.
	}
}