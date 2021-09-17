package grade;

public class Grade { // Grade는 Gold와 Silver의 부모클래스(=상위클래스=SuperClass),
					// Gold와 Silver는 자식클래스(=하위클래스=DerivedClass).
	private int id;
	private String name;
	private int point;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public double getBonus() { // 골드와 실버 공통되는 부분이긴하지만 애매함.
		return this.point*0.02;
	}

	public Grade(int id, String name, int point) { //상위클래스의 생성자 생성.
		this.id = id;
		this.name = name;
		this.point = point;
	}
	public Grade() { // 디폴트 생성자는 무조건 만들기.

	}
}
