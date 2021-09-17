package student1;

public class Main {
	public static void main(String[] args) {
		
		Student std1 = new Student();
		
		std1.setId(1001);
		std1.setName("Jack");
		std1.setKor(90);
		std1.setEng(60);
		std1.setMath(80);
		
		Student std2 = new Student();
		std2.setId(1002);
		std2.setName("Jane");
		std2.setKor(70);
		std2.setEng(50);
		std2.setMath(60);
		
		
		System.out.println("Jack 학생의 총점은 : " +(std1.getKor()+std1.getEng()+std1.getMath()));
		System.out.println("Jack 학생의 총점은 : " + std1.getsum());
		System.out.println("Jack 학생의 평균은 : " + std1.getAvg());
		System.out.println("Jane 학생의 총점은 : " +(std2.getKor()+std2.getEng()+std2.getMath()));
		System.out.println("Jane 학생의 총점은 : " + std2.getsum());
		System.out.println("Jane 학생의 평균은 : " + std2.getAvg());
	}
}