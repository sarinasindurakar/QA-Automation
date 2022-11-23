import java.util.Scanner;

public class switch_e {
    public static void main(String[] args){
        Scanner  scanner=new Scanner(System.in);
        System.out.println("Enter the fist number");
        double n1=scanner.nextDouble();
        System.out.println("Enter the second number");
        double n2=scanner.nextDouble();
        System.out.println("Select  the operator +,-/*");
        char operator = scanner.next().charAt(0);
         double result;
         switch (operator)
         {
             case '+':
                 result=n1+n2;
                 System.out.println("The addition"+result);
                 break;

             case '-':
                 result=n1-n2;
                 System.out.println("The subtraction"+result);
                 break;

             case '*':
                 result=n1*n2;
                 System.out.println("Multiplication"+result);
                 break;
             case '/':
                 result=n1/n2;
                 System.out.println("The division"+result);
                 break;

             default:
                 System.out.println("Invalid operator");
                 break;

         }


    }
}
