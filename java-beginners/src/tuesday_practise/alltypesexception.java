package tuesday_practise;

import java.util.Scanner;

public class alltypesexception {
    public static void main(String[] args) {
        int [] marks =new int[3];
        marks[0]=3;
        marks[1]=4;
        marks[2]=5;
        System.out.println("Enter the index of array");
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        System.out.println("Enter number you want to divide the value with");

        int num=sc.nextInt();
        try{
            System.out.println("the value of array index is"+marks[index]);
            System.out.println("the value is"+marks[index]/num);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
            System.out.println(e);


        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayoutofbound exception");
            System.out.println(e);

        }
        catch(Exception e) {
            System.out.println("other exception");
            System.out.println(e);
        }
    }

}
