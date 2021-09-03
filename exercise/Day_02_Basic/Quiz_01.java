
public class Quiz_01 {
	public static void main(String[] args) {
		
		byte b = 10;
		short s = 20;
		char c = 'A';
		int i;
		float f;
		long l = 100L;
		
		s = b; // short는 byte보다 크니 맞음.
//		c = b; // char는 형변환 불가능하기에 c = (char)b;
//		s = c; // char는 형변환 불가능하기에 s = (short)c;
//		c = s; // char는 형변환 불가능하기에 c = (char)s;
//		i = 100L; // int에 long을 넣을시엔 명시적으로 형변환 해야함 i = (int)100L;
		l = 500; // long에 정수대입했으니 맞음.
		f = l; // float은 long보다 크니 맞음.
//		f = 5.11; // float에 5.11로 초기화해주려면 f = 5.11f;로 해야함.
	}
}