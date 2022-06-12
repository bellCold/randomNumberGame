package assignment;
// assignment version2
import java.util.Random;
import java.util.Scanner;

public class Hw02Guess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int newRecord = 101;
        int score = 0;
        int fistGame = 0;
        int secondNumber;
        System.out.println("--------------");
        System.out.println("UP & DOWN GAME");
        System.out.println("--------------");
        while (true) {
            System.out.println("1.게임 시작하기 2.현재 최고기록보기 3. 프로그램 종료");
            int choiceNumber = scanner.nextInt();
            if (choiceNumber == 1) {
                score = 0;
                System.out.println("숫자 1 ~ 100 사이의 숫자를 입력해주세요.");
                int computerNumber = random.nextInt(100) + 1;
                while (true) {
                    System.out.print("숫자> ");
                    int firstNumber = scanner.nextInt();
                    if (firstNumber >= 0 && firstNumber <= 100) {
                        if (firstNumber == computerNumber) {
                            score++;
                            if (score < newRecord || fistGame == 0) {
                                newRecord = score;
                                System.out.println("축하합니다. 최고점수입니다! 점수: " + newRecord);
                                fistGame = 1;
                            } else {
                                System.out.println("정답입니다! 점수: " + score);
                            }
                            break;
                        } else if (firstNumber < computerNumber) {
                            System.out.println("UP");
                            score++;

                        } else {
                            System.out.println("DOWN");
                            score++;
                        }
                    } else {
                        System.out.println("경고 : 1 ~ 100 사이의 숫자만 입력 가능합니다!");
                    }
                }
            } else if (choiceNumber == 2) {
                if (score == 0) {
                    System.out.println("플레이 기록이 없습니다.");
                } else {
                    System.out.println("현재 최고점수 -> " + newRecord);
                }
            } else if (choiceNumber == 3) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("정확한 정보를 입력해주세요.");
            }
        }
        scanner.close();
    }
}