
public class Quiz_02 {
	public static void main(String[] args) {
	
		byte b = 10;
		char ch  = 'A';
		int i  = 100;
		long l = 1000L;
		
		b = (byte)i;
		ch = (char)b;
		short s = (short)ch;
		float f = (float)l; // 4번은 형변환을 하지 않아도 되는 것을 했음.
		i = (int)ch; // 5번은 형변환을 하지 않아도 되는 것을 했음.
	}
}
