package main;

import java.util.Scanner;

import grade.Silver;

public class Main_OG {
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

		Scanner sc = new Scanner(System.in);

		int id = 1001;
		int point = 0;
		int index = 0;
		Silver[] arr = new Silver[10];

		while(true) {
			System.out.println("=== 회원관리 시스템 ===");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 목록 출력");
			System.out.println("3. 시스템 종료");
			int menu = validInt(">>");

			if(menu == 1) {
				System.out.print("이름 : ");
				String name = sc.nextLine();
				
				Silver member = new Silver(id++, name, point);
				arr[index++]=member;

			}else if(menu == 2) {
				System.out.println("ID\t이름\t포인트\t보너스포인트");
				for(int i=0; i<index; i++) {
					System.out.println(arr[i].getId()+"\t"+arr[i].getName()+"\t"
							+arr[i].getPoint()+"\t"+arr[i].getBonus()+"\t"); 
				}

			}else if(menu ==3) {
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
		}
	}
}
