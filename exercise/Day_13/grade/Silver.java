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
	
	public Silver() {
		
	}
	public Silver(int id, String name, int point) {
		super(id, name, point);
	}
	public double getBonus() {
		return this.getPoint()*0.02;
	}
}