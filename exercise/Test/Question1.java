package kr.or.iei;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for(int i=0; i<5; i++) {
			int input = sc.nextInt();
			arr[i] = input;
			System.out.println(i+1 + "��° ���� �Է� : " + input);
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp;
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= tmp;
				}
			}
		}
		System.out.print("���ĵ� ��� : ");
		for(int j=0; j<5; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.print("���� �� ù��° ���� ������ ���� �� : ");
		System.out.println(arr[0]+arr[4]);
	}
}