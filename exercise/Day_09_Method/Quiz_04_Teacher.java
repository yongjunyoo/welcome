
public class Quiz_04_Teacher {
	
//	1번 방법.
//	public static int countA(String input){
//		int count = 0;
//		
//		for(int i=0; i<input.length(); i++) {
//			if(input.charAt(i) == 'A') {
//				count++;
//			}
//		}
//		return count;
//	}
	
	public static int countA(String input){
		int count = 0;
		char[] arr = input.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 'A') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
	
		String str = "AFDDFDSAFLKLDCVDSFDSDFD";
		
		int count = countA(str); // 전달받은 str내의 문자열에서 알파벳 A의 갯수를 return하는 메서드.
		System.out.println("알파벳 A의 개수는 : " + count);
	}
}
