package main;

import java.util.Scanner;

import grade.Gold;
import grade.Silver;
import manager.Manager;

public class Main_Copy {
	//	클래스 이름
	//	2) Main
	//
	//	=== 회원관리 시스템 ===
	//	1. 신규 회원 등록 - 선택시 id/이름/포인트를 입력받아 저장하는 기능
	//	2. 회원 목록 출력 - 선택시 전체회원에 대한 id/이름/포인트/보너스 포인트를 출력하는 기능
	//	3. 시스템 종료
	public static int validInt(String input){
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				System.out.print(input);
				int output = Integer.parseInt(sc.nextLine());
				return output;
			}catch(Exception e) {
				System.out.println("메뉴를 숫자로 입력해주세요.");
			}
		}
	}
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

		Manager manager = new Manager(); // 데이터가 Manager 클래스로 넘어갔기에 인스턴스 생성하여 사용.
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("=== 회원관리 시스템 ===");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 목록 출력");
			System.out.println("3. 시스템 종료");
			int menu = validInt(">>");

			if(menu == 1) {
				manager.addMember(new Gold(1001,"Tom",1000));
				manager.addMember(new Silver(1002,"Jack",2000));
				manager.addMember(new Silver(1003,"Susan",3000));
				manager.addMember(new Gold(1004,"Jane",4000));

			}else if(menu == 2) {
				Gold[] goldMembers = manager.getGoldMembers();
				for(int i =0; i<manager.getGoldIndex(); i++) {
					System.out.println(goldMembers[i].getId() +"\t"+goldMembers[i].getName() +"\t"+
							goldMembers[i].getPoint() +"\t"+goldMembers[i].getBonus());
				}
				
				Silver[] silverMembers = manager.getSilverMembers();
				for(int i =0; i<manager.getSilverIndex(); i++) {
					System.out.println(silverMembers[i].getId() +"\t"+silverMembers[i].getName() +"\t"+
							silverMembers[i].getPoint() +"\t"+silverMembers[i].getBonus());
				}
//				if(menu == 1) {
//					System.out.print("ID : ");
//					String id = Integer.parseInt(sc.nextLine());
//					System.out.print("이름 : ");
//					String name = sc.nextLine();
//					System.out.print("이름 : ");
//					String point = Integer.parseInt(sc.nextLine());
//					
//					Silver member = new Silver(id, name, point);
//					arr[index++]=member;
//				}elseif(menu==2){
//					System.out.print("ID : ");
//					int id = Integer.parseInt(sc.nextLine());
//					System.out.print("이름 : ");
//					String name = sc.nextLine();
//					System.out.print("포인트 : ");
//					int point = Integer.parseInt(sc.nextLine());
//
//					Silver s = new Silver(id, name, point);
//					manager.addMember(s);
//				}
			}else if(menu ==3) {
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
		}
	}
}