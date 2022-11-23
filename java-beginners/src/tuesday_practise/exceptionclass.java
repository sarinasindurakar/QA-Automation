package tuesday_practise;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am tostring";
    }

    @Override
    public String getMessage() {
        return "I am getmessage";
    }
}

public class exceptionclass {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the value of a:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>10){
            try{
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();


            }
            System.out.println("Bye");

        }

    }
}
