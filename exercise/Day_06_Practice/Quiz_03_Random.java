
public class Quiz_03_Random {
	public static void main(String[] args) {

		
		System.out.println("0 ~ 9 까지의 랜덤수 : " + (int)(Math.random() * (9-0+1)+0));
		System.out.println("1 ~ 10 까지의 랜덤수 : " + (int)(Math.random() * (10-1+1)+1));
		System.out.println("20 ~ 35 까지의 랜덤수 : " + (int)(Math.random() *(35-20+1)+20));
		System.out.println("0 또는 1 : " + (int)(Math.random() * (1-0+1)+0));

		//double rand = Math.random();
		//double rand1 = (int)(Math.random()*(20-10)+1);
		//System.out.println((int)(rand * 10));
		//System.out.println((int)(rand * 10)+1);
	}
}
