package grade;

public class Gold extends Grade{
	
	public Gold() {
		
	}
	public Gold(int id, String name, int point) {
		super(id, name, point);
	}
	// getBonus는 상속받아 원래 있지만 생성해준다.
	public double getBonus() {
		// return this.point*0.03; grade의 private때문에 못씀.
		// overrides grade Grade.getBonus라는 표시가 뜸. why? override는 무효화시키다.
		// 부모클래스로부터 물려받은 내용을 자식클래스가 무효화시키고 자기걸로 바꾸는 문법이기 때문.
		// 오버라이딩이 자유의지가 되어버린다. 문법적으로 제약이없음. 해도그만 안해도 그만.
		return this.getPoint()*0.03;
	}
}