package tuesday_practise;

public class exception_example {

    public static void main(String[] args) {
        int a=70;
        int b=0;
        try{
            int c=a/b;
            System.out.println("The result is "+c);

        }
        catch(Exception e) {
            System.out.println("we failed to divide");
            System.out.println(e);


        }
        System.out.println("end");
    }
}
