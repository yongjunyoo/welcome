package exams;

import java.util.Scanner;

import classes.Student;

public class Exam_02 {

	public static int inputValidInt(String msg) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print(msg);
				int num = Integer.parseInt(sc.nextLine());
				return num;
			}catch(Exception e) {
				System.out.println("숫자를 입력해야 합니다.");
			}
		}
	}

	public static void main(String[] args) {
		int id = 1001; // 학생들에게 순차적으로 부여될 고유 ID값.
		Student[] stds = new Student[10];
		int index = 0; // 배열에 들어갈 인덱스 초기값.

		// 1. Student 클래스 만들기.
		// id, name, kor, eng, math
		// getter,setter / constructor / default constructor / getSum(국영수합) getAvg(평균)
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("=== 학생 관리 시스템 ===");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 목록 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 수정"); // 선택과제 - 아이디와 새로운 정보를 입력받아서 대상정보를 수정.
			System.out.println("5. 학생 성적 순위"); // 선택과제 - 성적순으로 정렬하여 출력하는 기능.
			System.out.println("0. 시스템 종료");
			int menu = inputValidInt(">>");

			if(menu == 1) {
				System.out.print("이름 : ");
				String name = sc.nextLine();

				int kor = inputValidInt("국어 : ");
				int eng = inputValidInt("영어 : ");
				int math = inputValidInt("수학 : ");
				// 2. 입력받은 모든 값과 ID를 Student 인스턴스에 저장하는 코드를 작성하세요.
				Student std = new Student(id++, name, kor, eng, math);

				// 3. 작성된 Student 인스턴스가 프로그램 전체에서 소멸하지않고 언제든 사용할 수 있게끔
				//    Student 형 배열에 순차적으로 저장하는 코드를 작성하세요.
				stds[index++] = std;
			}else if(menu == 2) {
				// 4. 저장된 모든 학생의 정보를 화면에 출력하세요.
				for(int i=0; i<index; i++) { // 습관적으로 stds.length를 입력하면 에러발생.
					System.out.println(stds[i].getId() + "\t" + stds[i].getName() + "\t" 
							+ stds[i].getKor() + "\t" + stds[i].getEng() + "\t" + stds[i].getMath()
							+ stds[i].getSum() + "\t" + stds[i].getAvg());
				}
			}else if(menu == 3) {
				// 5. 이름으로 학생 정보 검색.
				System.out.print("검색할 학생의 이름 : ");
				String name = sc.nextLine();

				boolean existFlag = false;  // boolean 변수 선언.
				for(int i=0; i<index; i++) {
					if(stds[i].getName().equals(name)) {
						System.out.println(stds[i].getId() + "\t" + stds[i].getName() + "\t" 
								+ stds[i].getKor() + "\t" + stds[i].getEng() + "\t" + stds[i].getMath()
								+ stds[i].getSum() + "\t" + stds[i].getAvg());
						existFlag = true;
					}
				}
				if(!existFlag) {
					System.out.println("해당 학생 정보가 없습니다.");
				}
			}else if(menu == 0) {
				System.out.println("시스템을 종료합니다.");
			}else {
				System.out.println("메뉴를 확인하고 입력해주세요.");
			}
		}
	}
}
