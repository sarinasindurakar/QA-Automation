import java.util.Scanner;

import static java.lang.Math.round;

public class grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of classes held");
        double c_h = scanner.nextDouble();
        System.out.println("Enter the number of classes attended");
        double c_a = scanner.nextDouble();
        System.out.println("The total number of class held:" + c_h);
        System.out.println("The toal number of class attended:" + c_a);
        double p = (c_a * 100) / c_h;
        System.out.println("The total percentage of class attended" + p + "%");
        if (p < 75) {
            System.out.println("Your percentage is too  low:"+p);
            System.out.println("any medical cause");
            System.out.println("Enter your choice:1=yes and 2=no");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("you are allowed");
                    break;

                case 2:
                    System.out.println("you are not allowed");
                    break;

                default:
                    System.out.println("invalid choice");
                    break;


            }
        }
         else {
            System.out.println("you're allowed to sit in exam");
        }


    }
}

