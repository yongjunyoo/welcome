package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_03_ArrayList {
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList(); // Collection Library.
		
		// arr[0] = "Hello"는 못씀. 배열이 아니라 인스턴스니까.
		
		// 입력.
		arr.add("Hello");	// 배열번호는 넣을 수 없음. 동적배열이기에 빈공간이 있으면 땡겨짐.
		arr.add("Java");
		arr.add("World");
		
		// Object : 자바에 존재하는 모든 클래스의 최고 조상 클래스. 다형성의 꼭대기.
		Object o = new Scanner(System.in);
		arr.add(123);	// 다형성으로 넣을 수 있음. but 상속관계는? 안의 값을 Object 객체로 갖고있기에 가능.
		arr.add(3.14);  // a.찍을 때 어시스트를 보면 끝에 Object라고 나오는건 근원지라는 뜻.
		arr.add(new Scanner(System.in)); // 모든 클래스는 Object로부터 상속받음.
		// ---> 기본형인데 123, 3.14 등을 넣으려고하면 알아서 Integer(123); 으로 감싸줌.(Wrapper Class).
		// arr.get(0).length()는 사용할 수 없음. why? Object는 다형성으로 Object의 기능을 불러오기때문.
		// 따라서 오버라이딩하거나 캐스팅을 해줘야함. 
		System.out.println(((String) arr.get(0)).length()); // 배열에 담긴 것의 길이를 알 수 있음.
		System.out.println(arr.size()); // 배열의 사이즈를 알 수 있음.
		
		// 출력.
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println("==========");

		// 삭제.
		arr.remove(0); // 옮겨담을 필교가 없음. 알아서 땡겨주기 때문.
		
		// 출력.
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
//		System.out.println(arr.get(2)); 삭제해서 댕겨왔기에 사라짐.
		System.out.println("==========");
		
		// 삽입.(끼워넣기.)
		arr.add(0,"Good");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println("==========");
		
		// ArrayList는 데이터 갯수에 제한이 없음.
	}
}
