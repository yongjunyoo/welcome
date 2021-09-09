import java.util.Random;
import java.util.Scanner;

public class Exam_05_Random {
	public static void main(String[] args) {
		
		// 난수 - Random Number
		
		double rand = Math.random();
		// Math.random으로 발생하는 난수는 0~1 사이의 double 값으로 발생함.(0과 1제외).
		System.out.println(rand);
		
		//Math.random(); 으로 발생할 수 있는 가장 작은 난수 0.0000000001, 가장 큰난수 0.9999999999
		
		System.out.println(rand * 10);
		System.out.println((int)rand * 10); // 0~9 사이의 수
		// rand * 10  -> 한다면 10보다 작은 수가 나온다. ex. 9.98221
		// (int)rand * 10 -> 한다면 0 ~ 9사이의 숫자가 나온다.
		
		double rand1 = Math.random();
		// 만약에 1 ~ 10사이의 숫자를 난수로 생성하길 원한다면.
		System.out.println((int)(rand1 * 10) + 1);
		
		double rand2 = Math.random();
		// 만약에 주사위의 숫자 1 ~ 6사이의 숫자를 난수로 생성하길 원한다면.
		System.out.println((int)(rand * 6) + 1);
		
		// 16 ~ 34 사이의 난수를 구한다면
		// 최대값 : X
		// 최소값 : Y
		// (int)(Math.random() * (34 - 16 + 1) + 34
		}
	}