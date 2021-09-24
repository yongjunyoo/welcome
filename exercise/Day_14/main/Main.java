package main;

import java.util.ArrayList;
import java.util.Scanner;

import manager.Manager;
import student.Student;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int id = 1001;
		Manager m = new Manager();
		ArrayList list = m.getMember();

		while(true) {
			System.out.println("=== 학생 관리 시스템 ===");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 목록 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 시스템 종료");
			int menu = Integer.parseInt(sc.nextLine());

			if(menu == 1) {
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("국어 : ");
				int kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 : ");
				int eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 : ");
				int math = Integer.parseInt(sc.nextLine());
				Student std = new Student(id++, name, kor, eng, math);
				m.addMember(std);

			}else if(menu == 2) {
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				for(int i=0; i<list.size(); i++) {
					System.out.println(((Student)list.get(i)).getId()+"\t"+
							((Student)list.get(i)).getName()+"\t"+
							((Student)list.get(i)).getKor()+"\t"+
							((Student)list.get(i)).getEng()+"\t"+
							((Student)list.get(i)).getMath()+"\t"+
							((Student)list.get(i)).getSum()+"\t"+
							((Student)list.get(i)).getAvg());
				}
			}else if(menu == 3) {
				System.out.print("이름을 입력해주세요 : ");
				String name = sc.nextLine();
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
				for(int i=0; i<list.size(); i++) {
					if(name.equals(((Student)list.get(i)).getName())) {
						System.out.println(((Student)list.get(i)).getId()+"\t"+
								((Student)list.get(i)).getName()+"\t"+
								((Student)list.get(i)).getKor()+"\t"+
								((Student)list.get(i)).getEng()+"\t"+
								((Student)list.get(i)).getMath()+"\t"+
								((Student)list.get(i)).getSum()+"\t"+
								((Student)list.get(i)).getAvg());
					}
				}
			}else if(menu == 4) {
				System.out.print("ID를 입력해주세요 : ");
				int id1 = Integer.parseInt(sc.nextLine());
				for(int i=0; i<list.size(); i++) {
					if(id1 == ((Student)list.get(i)).getId()) {
						System.out.print("이름 : ");
						((Student)list.get(i)).setName(sc.nextLine());
						System.out.print("국어 : ");
						((Student)list.get(i)).setKor(Integer.parseInt(sc.nextLine()));
						System.out.print("영어 : ");
						((Student)list.get(i)).setEng(Integer.parseInt(sc.nextLine()));
						System.out.print("수학 : ");
						((Student)list.get(i)).setMath(Integer.parseInt(sc.nextLine()));
					}
				}
			}else if(menu == 5) {
				System.out.print("ID를 입력해주세요 : ");
				int id2 = Integer.parseInt(sc.nextLine());
				for(int i=0; i<list.size(); i++) {
					if(id2 == ((Student)list.get(i)).getId()) {
						list.remove(i);
					}
				}
			}else if(menu == 5) {
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
		}
	}
}