import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        /*
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int b=sc1.nextInt();
        int sum=a+b;
        System.out.println(sum);
        */

        System.out.println("enter a string");
        Scanner sc2=new Scanner(System.in);
        String name=sc2.next();//next only prints the one token first  name
        System.out.println(name);
        System.out.println("enter a fullname");
        Scanner sc3=new Scanner(System.in);
        String name1=sc3.nextLine();//next only prints the one token first  name
        System.out.println(name1);


    }
}
