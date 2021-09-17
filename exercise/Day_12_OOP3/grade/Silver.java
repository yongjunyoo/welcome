package grade;

public class Silver extends Grade{
//	클래스 2개만듦.
//	클래스 이름
//	1) Silver - 실버등급 회원의 정보를 저장하기 위한 클래스
//
//	멤버필드
//	 - int id; // 회원 고유 ID
//	 - String name; // 회원 이름
//	 - int point; // 회원 누적포인트
//
//	멤버메서드
//	getter,setter / constructor / default constructor /
//  getBonus(silver 등급 회원의 포인트에 대한 2% 보너스를 적용해서 dobule형으로 변환시키는 메서드)

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
//	public Silver(int id, String name, int point) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.point = point;
//	}
//	public Silver() {
//	}
//	public double getBonus() {
//		return this.point*0.02;
//	}
//}
	
//	public Silver(int id, String name, int point) {
//		this.id = id;
//		this.name = name;
//		this.point = point;
//	}
	
	public Silver(int id, String name, int point) {
		super(id, name, point); // 상위클래스의 생성자 호출.
								// 세터를 이용해도 되지만 귀찮으니 super()의 기능을 이용하면 편함.
	}
	public Silver() {  // 디폴트 생성자는 무조건 만들것.
		
	}
}
