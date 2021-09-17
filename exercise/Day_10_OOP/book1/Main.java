package book1;

public class Main {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.setId(1001);
		b1.setTitle("로미오와줄리엣");
		b1.setPrice(14000);
		
		Book b2 = new Book();
		
		b2.setId(1002);
		b2.setTitle("아프니까 청춘이다");
		b2.setPrice(15000);
		
		Book b3 = new Book();
		
		b3.setId(1003);
		b3.setTitle("주홍글씨");
		b3.setPrice(20000);
		
		System.out.println("책 3권의 총 가격은 : " + (b1.getPrice() + b2.getPrice() + b3.getPrice()));
	}
}
