package tuesday_practise;

public class threading extends Thread {
    public void run(){

            System.out.println("Thread is running...");
        }

    public static void main(String[] args) {
        threading obj=new threading();
        obj.start();
        threading obj1=new threading();
        obj1.start();



    }
}




