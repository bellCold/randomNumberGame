package assignment;

import java.util.Random;
import java.util.Scanner;

/*컴퓨터를 상대로하는 가위바위보게임
단, 플레이와 현재 기록보기 기능이 분리되어있으며 플레이시
1-> 가위 2->바위 3-> 보  입력
승리 패배 무승부
현재 기록을 볼 떄
총  ## 전 ##무 ## 패 (승률 ##%)*/
public class Hw01RSP {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean result = true;
        int i = 0;
        int win = 0;
        int draw = 0;
        int lose = 0;
        while (result) {
            System.out.println("--------------------------------------------");
            System.out.println("1.가위  2.바위  3.보 4.현재 기록 보기 5.프로그램 종료");
            System.out.println("--------------------------------------------");
            int computer = random.nextInt(3) + 1;
            System.out.print("> ");
            int user = scanner.nextInt();
            if (user == computer) {
                System.out.println("무승부");
                draw++;
            } else if ((user == 1 && computer == 2) || (user == 2 && computer == 3) || (user == 3 && computer == 1)) {
                System.out.println("패배");
                lose++;
            } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
                System.out.println("승리");
                win++;
            } else if (user == 4) {
                double odds = (double) win / i * 100;
                System.out.printf("총 전적: %d 승리: %d 패배: %d 무승부: %d 승률: %.2f%% \n", i, win, lose, draw, odds);
                i--;
            } else if (user == 5) {
                System.out.println("프로그램 종료.");
                break;
            } else {
                System.out.println("선택 항목을 다시 입력해주세요.");
            }
            i++;
        }
    }
}
