package grade;

public class Gold extends Grade {
//	private int id;
//	private String name;
//	private int point;
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getPoint() {
//		return point;
//	}
//	public void setPoint(int point) {
//		this.point = point;
//	}
//	public Gold(int id, String name, int point) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.point = point;
//	}
//	public Gold() {
//	}
//	public double getBonus() {
//		return this.point*0.03;
//	}
//}
	
//	public Gold(int id, String name, int point) {
//		this.id = id;
//		this.name = name;
//		this.point = point;
	
	public Gold(int id, String name, int point) {
		super(id, name, point); // 상위클래스의 생성자 호출. 
								// 세터를 이용해도 되지만 귀찮으니 super()의 기능을 이용하면 편함.
	}
	public Gold() {  // 디폴트 생성자는 무조건 만들것.
		
	}
}
