import java.util.Scanner;

public class mortage_calculator {
    public static void main(String[] args) {

        Scanner p=new Scanner(System.in);
        System.out.println("Enter a principle");
        int principal=p.nextInt();
        System.out.println("Enter a rate");
        double rate=p.nextDouble();
        rate=(rate/100)/12;
        System.out.println("Enter a time period");
        int time = p.nextInt();
        time = time * 12;
        double m=(principal * rate) / (1 - Math.pow(1 + rate, -time));
        System.out.println("payment"+ m);

    }
}
