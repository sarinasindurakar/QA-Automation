import java.util.Scanner;

public class array_practise {
    public static void main(String[] args) {
        //taking the 10 input from user and printing the inputs


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any one number fro 1-5");
        int num = scanner.nextInt();
        System.out.println("Enter the 5 number from 1-10");
        int[] a = new int[5];
        //input in array
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        boolean value=false;
        for (int i = 0; i < a.length; i++) {
            // System.out.println("The value of a[" + i + "] is " + a[i]);
            if (a[i] == num) {
                value = true;

                break;
            }
        }
            if(value){
                System.out.println("Value found");

            }
            else{
                System.out.println("not found");
            }



    }
}

