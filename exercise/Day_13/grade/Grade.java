package grade;

abstract public class Grade { // 추상클래스. new하여 인스턴스를 사용할 수 없음.
							// 그래도 괜찮은 이유. why? 골드와 실버에 상속해줬기에 new할 필요가 없음.
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
	abstract public double getBonus();
	// return this.point*0.02; 공통요소이기에 내용이 중요한 것은 아니게 되어버림.
	// abstract를 붙여버리고 중괄호를 날려버림. void는 못씀. why? 골드와 실버에 리턴해줘야하기에.
	// 자바야, getBonus는 추상적인거야 그런게 있어. 나는 골드와 실버에 오버라이딩의 자유의지를 없앨거야.

	public Grade() {
		super();
	}
	public Grade(int id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}
}