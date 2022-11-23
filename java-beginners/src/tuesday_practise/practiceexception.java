package tuesday_practise;

public class practiceexception {
    public static void main(String[] args) {
        //int a=7//syntax error
        int p=22;
       // int date=222-3;logical error
        try{
            int a=p/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch(ArithmeticException e){
            System.out.println("Haha");
        }
    }
}
