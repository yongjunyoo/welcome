package exams;

import java.io.FileInputStream;
import java.util.Scanner;
import javazoom.jl.player.Player;

public class Exam_03_Mp3_Player {
	public static void main(String[] args) {
//		Jlplayer(즐레이어) : mp3를 java플랫폼에서 실시간으로 전송할 수 있는 라이브러리
//		프로젝트 우클릭 -> properties -> java build path -> library -> classpath
//		-> add external jars -> 파일찾기 -> 음악파일 드래그해서 프로젝트에 넣기.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== JukeBox ===");
		System.out.println("1. Extreme Ways");
		System.out.println("2. Counting Stars");
		System.out.println("3. Happy");
		System.out.print(">>");
		int menu = Integer.parseInt(sc.nextLine());
		
		String musicName = null;
		if(menu == 1) {
			musicName = "moby - extreme ways.mp3";
		}else if(menu == 2) {
			musicName = "One Republic - Counting Stars.mp3";
		}else if(menu == 3) {
			musicName = "Pharrell Williams - Happy.mp3";
		}
		
		try{
			FileInputStream fis = new FileInputStream(musicName);
			Player playMP3 = new Player(fis);
			playMP3.play();
		}
		catch(Exception exc){
			exc.printStackTrace();
			System.out.println("Failed to play the file.");
		}
	}
}