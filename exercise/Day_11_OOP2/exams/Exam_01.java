package exams;

import classes.Contact;

public class Exam_01 {
	public static void main(String[] args) {


		// Contact 클래스 만들기.
		// 숫자 id, 이름 name, 연락처 contatct
		// getter&setter / constructor / default constructor
		// 1001, Susan, 01012341234
		// 1002, Tom, 01091239123
		// 1003, Jack, 01015241524

		Contact c1 = new Contact(1001, "Susan", "01012341234");
		Contact c2 = new Contact(1002, "Tom", "01091239123");
		Contact c3 = new Contact(1003, "Jack", "01015241524");

		System.out.println(c1.getId() + " : " + c1.getName() + " : " + c1.getContact());
		//sysout을 3번해야하는 번거로움. 배열을 사용하면 편리함.

		// Contact[] contacts = new Contact[3];
		// contacts[0] = c1;
		// contacts[1] = c2;
		// contacts[2] = c3; 혹은
		// Contact[] contacts = new Contact[] {c1,c2,c3}; 혹은
		Contact[] contacts = new Contact[]
				{new Contact(1001, "Susan", "01012341234"),
						new Contact(1002, "Tom", "01091239123"),
						new Contact(1003, "Jack", "01015241524")
				};
		//contacts라는 변수를 만들고 stack에 만들어진 변수는 1개 heap에 만들어진 변수는 3개

		// stack에는 c1, c2, c3, contacts
		// c1의 주소를 찾아가면 Contact인스턴스(1001, Susan, 01012341234)
		// c2의 주소를 찾아가면 Contact인스턴스(1002, Tom, 01091239123)
		// c3의 주소를 찾아가면 Contact인스턴스(1003, Jack, 01015241524)
		// contacts의 주소를 찾아가면 Contact인스턴스의 배열
		for(int i=0; i<contacts.length; i++) {
			System.out.println(contacts[i].getId() + " : " + contacts[i].getName() + " : " + contacts[i].getContact());
		}
		// 이름이 Tom인 사람의 연락처를 검색해서 출력.
		for(int i=0; i<contacts.length; i++) {
			if(contacts[i].getName().equals("Tom")) {
				System.out.println(contacts[i].getContact());
			}
		}
		// 아이디가 1003번인 사람을 찾아서 전화번호를 01011112222로 수정해보세요.
		for(int i=0; i<contacts.length; i++) {
			if(contacts[i].getId() == 1003) {
				contacts[i].setContact("01011112222");
			}
		}
	}
}