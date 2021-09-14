
public class Quiz_01 {
	
	public static String translate(String input){
		if(input.equals("사과")) {
			return "Apple";
		}else if(input.equals("포도")) {
			return "Grape";
		}else {
			return "None";
		}
	}
	
	public static void main(String[] args) {
		
		// 메서드 만들기.
		// "사과"를 전달하면, "Apple"를 return하고
		// "포도"를 전달하면, "Grape"를 return하는 메서드 trnaslate를 만드세요.
		// "사과"나 "포도"가 아니면 "None"을 return.
		
		translate("사과");
		translate("포도");
		translate("바보");
		System.out.println(translate("사과"));
		System.out.println(translate("포도"));
		System.out.println(translate("바보"));
	}
}