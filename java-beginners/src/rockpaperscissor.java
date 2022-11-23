import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        final int rock = 1, scissor = 2, paper = 3;
        //rock and paper scissor
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the option:");
        System.out.println("Rock=1,scissor=2,paper=3");
        int player1 = scanner.nextInt();
        int player2 = scanner.nextInt();
       System.out.println("the player1 choose:"+player1);
       System.out.println("the player1 choose:"+player2);
        if (player1 == player2) {
            System.out.println("It is tie");

        } else {
            switch (player1) {
                case rock:
                    if (player2 == scissor) {
                        System.out.println("Rock beats scissor,player 1 wins");
                    }
                    else  {
                        System.out.println("Paper beats rocks,player 2 wins");

                    }
                    break;

                case paper:
                    if (player2 == rock) {
                        System.out.println("paper beats rock,player 1 wins");
                    } else{
                        System.out.println("Scissor beats the paper,player 2 wins");
                    }
                    break;
                case scissor:
                    if (player2 == rock) {
                        System.out.println("Rock beats scissor,player 2 wins");
                    } else {
                        System.out.println("scissor beats paper,player 1 wins");
                    }
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
    }
}
