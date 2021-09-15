package main;
import java.util.Scanner;

import javax.swing.JFrame;

import electronic.Monitor;
import electronic.Tv;

import java.awt.Robot;

public class Main {
	public static void main(String[] args) throws Exception{

		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();
		Scanner sc = new Scanner(System.in);
		// 스캐너는 클래스이기에 대문자 시작. sc라는 변수에 new Scanner는 인스턴스 주소값을 담았다.

		// m.하면 Monitor의 기능을 변수를 통해 주소값을 불러와 실행시킬 수 있음.

		String str1 = "ABC";
		String str2 = new String("ABC");
		// stack에 str1과 str2가 있음.
		// str2는 new String으로 인스턴스가 있음.
		// str2는 인스턴스의 주소값을 가져옴.

		//		Robot r = new Robot();
		//		for(int i=0; i<100; i++) {
		//			r.mouseMove(600+i, 600);
		//			Thread.sleep(10);
		//	}

		Tv lg = new Tv();
		// lg.channel = 10; // private로 제한하여 직접 건드릴 순 없지만.
		lg.setChannel(10);     // private한 channel엔 접근못하지만 그러한 기능을 가진 메소드를 쓰자.
		System.out.println(lg.getChannel()); // get을 출력할 수 있음.
		lg.setVolume(20);
		System.out.println(lg.getVolume());
		
		JFrame f;
		// f.~~~ 할 때 수많은 기능들 중, 무엇을 사용할지 혼동이 온다.
		
	}
}
