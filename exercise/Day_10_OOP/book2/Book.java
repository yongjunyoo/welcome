package book2;

public class Book {
	private int id;
	private String title;
	private int price;
	
	public Book(int id, String title, int price) { // 인스턴스가 만들어지는 순간 자동으로 실행됨.
		this.id = id; // 매개변수가 램에서 사라지기 전에 멤버필드에 값을 넣어줌.
		this.title = title; // 매개변수가 램에서 사라지기 전에 멤버필드에 값을 넣어줌.
		this.price = price; // 매개변수가 램에서 사라지기 전에 멤버필드에 값을 넣어줌.
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
