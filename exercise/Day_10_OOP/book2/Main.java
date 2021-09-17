package book2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Book b1 = new Book(1001, "로미오와줄리엣", 14000); 
		// 인스턴스 생성 즉시 생성자 콜. new book()는 생성자 콜.
		// 매개변수도 가질 수 있다.
		Scanner sc = new Scanner(System.in);
		// System.in과 같은 인자값에 무엇이 들어가느냐에 따라 달라짐.
		
		b1.setId(1001);
		b1.setTitle("로미오와줄리엣");
		b1.setPrice(14000);
		
		Book b2 = new Book(1002, "아프니까 청춘이다", 15000); 
		// 인스턴스 생성 즉시 생성자 콜. new book()는 생성자 콜.						
		// 매개변수도 가질 수 있다.
		
		b2.setId(1002);
		b2.setTitle("아프니까 청춘이다");
		b2.setPrice(15000);
		
		Book b3 = new Book(1003, "주홍글씨", 20000);  
		// 인스턴스 생성 즉시 생성자 콜. new book()는 생성자 콜.
		// 매개변수도 가질 수 있다.
		
		b3.setId(1003);
		b3.setTitle("주홍글씨");
		b3.setPrice(20000);
		
		System.out.println("책 3권의 총 가격은 : " + (b1.getPrice() + b2.getPrice() + b3.getPrice()));
	}
}
