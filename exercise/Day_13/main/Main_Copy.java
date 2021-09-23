package main;

import java.util.ArrayList;
import java.util.Scanner;

import grade.Gold;
import grade.Grade;
import grade.Ruby;
import grade.Silver;
import manager.Manager_Copy;

public class Main_Copy {
	//	클래스 이름
	//
	//	=== 회원관리 시스템 ===
	//	1. 신규 회원 등록 - 선택시 id/이름/포인트를 입력받아 저장하는 기능
	//	2. 회원 목록 출력 - 선택시 전체회원에 대한 id/이름/포인트/보너스 포인트를 출력하는 기능
	//	3. 시스템 종료

	int index = 0;

	public static void main(String[] args) {
		
		// 회원관리 시스템의 문제점 3가지.
		// 1. 코드 중복도가 높다. 
		// -> 상속 문법을 통해 해결.
		// 2. 코드 결합도가 너무 높다. 
		// : 클래스와 클래스 사이의 의존도가 높으면 별로임.
		//	 하나를 고치면 다른하나에 영향이가기에 유지보수에 불리함.
		// -> 다형성 문법을 통해 해결.
		// 3. 저장소 문제.
		// -> Collection Framework로 해결.
		
		Scanner sc = new Scanner(System.in);

		Manager_Copy manager = new Manager_Copy();

		while(true) {
			System.out.println("=== 회원관리 시스템 ===");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 목록 출력");
			System.out.println("3. 시스템 종료");
			System.out.print(">>");
			int menu = Integer.parseInt(sc.nextLine());

			if(menu == 1) {
				manager.addMember(new Gold(1001,"Tom",1000));
				manager.addMember(new Silver(1002,"Jack",2000));
				manager.addMember(new Silver(1003,"Susan",3000));
				manager.addMember(new Gold(1004,"Jane",4000));
				manager.addMember(new Ruby(1004,"Mike",4000));

			}else if(menu == 2) {
//				Gold[] goldMembers = manager.getGoldMembers();
//				for(int i=0; i<manager.getGoldIndex(); i++) {
//					System.out.println(goldMembers[i].getId() +"\t"+goldMembers[i].getName() +"\t"+
//							goldMembers[i].getPoint() +"\t"+goldMembers[i].getBonus());
//				}
//				
//				Silver[] silverMembers = manager.getSilverMembers();
//				for(int i=0; i<manager.getSilverIndex(); i++) {
//					System.out.println(silverMembers[i].getId() +"\t"+silverMembers[i].getName() +"\t"+
//							silverMembers[i].getPoint() +"\t"+silverMembers[i].getBonus());
//				}
				ArrayList members = manager.getMembers();
				for(int i=0; i<members.size(); i++) {
					System.out.println(((Grade)members.get(i)).getId() + "\t" +
							((Grade)members.get(i)).getName() + "\t" +
							((Grade)members.get(i)).getPoint() + "\t" +
							((Grade)members.get(i)).getBonus());
				}
				// Grade형 배열 안에 실버와 골드의 내용을 씀. getBonus는 오머라이딩되었기에 다운캐스팅없이 사용.
				// 만약 getBonus가 오머라이딩 되어있지 않다면 직접 다운캐스팅. 
				//	if(members[i] instanceof Gold) {
				//	((Gold)members[i]).getBonus();
				//	}

			}else if(menu == 3) {
				System.out.println("시스템을 종료합니다.");
				System.exit(0);

			}else {
				System.out.println("메뉴를 확인하세요.");
			}
		}
	}
}