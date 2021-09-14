
public class Exam_04_여러메소드예제 {
	public static void main(String[] args) {
		
		String str = "Hello"; // str.을 하면 다양한 메서드들이 나온다.
		
		Math.random(); // Math.random() : double - Math라고 나온다. 인자값없이 double형을 반환하는 것.
		
		int len = str.length(); //str.length() : int - String라고 나온다.
		                        // 인자값 없이 int로 반환.
		System.out.println(len);
		
		char len2 = str.charAt(0); // str.charAt(int) : char - Stirng라고 나온다. 
								   //인자값을 int로 받고 char로 반환.
		System.out.println(len2);
		
		char[] len3 = str.toCharArray(); // str.toCharArray(): char[] - String라고 나온다.
		                  // 인자값 없이 반환이 char[] 배열로 나온다.
						  // String Hello가 저장된 Heap의 주소값을 가져옴.
		System.out.println(len3[1]);
		
		boolean result1 = str.startsWith("A"); // str.startsWith(String prefix) : boolean - String이라고 나온다.
							                   // 파라미터의 값이 A인데 str의 시작이 A이니? true/false
		boolean result2 = str.endsWith("o");   // str.endsWith(String prefix) : boolean - String이라고 나온다.
											   // 파라미터의 값이 o인데 str의 끝이 o이니? true/false
		boolean result3 = str.contains("H");   // str.contains(charsequence s) : boolean - String이라고 나온다.
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		boolean result4 = str.equals("Hello"); // str.equals(object anobject) : boolean - string
											   // 파라미터의 값이 Hello인데 str의 이 Hello이니? true/false
		System.out.println(result4);

		String str2 = "Apple:Orange:Mango"; // str2.split(String regex) : String[] - String
		String[] fruit = str2.split(":");   // regex : 로 문자열을 나눠 String[] 배열로 뱉는다.
		System.out.println(fruit[0]);
	}
}
