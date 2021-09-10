import java.util.Scanner;

public class Quiz_03_Random_UpDown {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int sel;
      int num;
      int random = (int)(Math.random()*(99-1+1)+1);

      System.out.println("=== Up & Down Game" + "\n");
      System.out.println("1. Game Start");
      System.out.println("2. End Game");
      System.out.print(">>");

      while(true) {
         try {
            sel = Integer.parseInt(sc.nextLine());
            break;
         }catch(Exception e) {
            System.out.println("숫자로 입력해주세요.");
         }
      }

      if(sel == 1) {
         System.out.println("<<  Game Start  >>");

         while(true) {
            System.out.print("Input Number :");
            num = Integer.parseInt(sc.nextLine());

            if(num == random) {
               System.out.println("<< 정답 >>");
               break;
            }else if(num>random) {
               System.out.println("<< Down >>");
            }else {
               System.out.println("<< Up >>");
            }
         }
      }else {
         System.out.println("게임을 종료합니다.");
      }
   }
}