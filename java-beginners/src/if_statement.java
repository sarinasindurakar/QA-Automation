import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
/*
        int temp=12;
        if(temp>30){
            System.out.println("It is a hot day");
        } else if (temp<=30 && temp>=20) {
            System.out.println("It is a moderate day");

        }
        else {
            System.out.println("It is a cold day");
        }

 */

        Scanner  scanner=new Scanner(System.in);
        System.out.println("Enter the fist number");
        int n1=scanner.nextInt();
        if(n1%5==0 && n1%3==0){
            System.out.println("Fizzbuzz");

        } else if(n1%3==0) {
            System.out.println("buzz");
        } else if (n1%5==0 ) {
            System.out.println("fizz");
        }else{
            System.out.println("n1");
        }

    }

    }

