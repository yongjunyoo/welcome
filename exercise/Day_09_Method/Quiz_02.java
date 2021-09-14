
public class Quiz_02 {
	
	public static int myrandom(int num1, int num2){
		if(num1>num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;    // 숫자를 잘못 넣으면 이러한 조건으로 해결.
		}
		int result = (int)(Math.random() *(num2-num1+1)+num1);
		return result;
	}
	
	public static void main(String[] args) {
		
		// 난수를 만드는 메서드.
		myrandom(10,20); // 10,20 숫자를 인자로 넣어 호출해서 10~20사이의 난수 만듦.
		myrandom(1,10);  // 1,10 숫자를 인자로 넣어 호출해서 1~10사이의 난수 만듦.
		System.out.println(myrandom(10,20));
		System.out.println(myrandom(1,10));
	}
}