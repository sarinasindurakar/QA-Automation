package tuesday_practise;
class mythread extends Thread{
    @Override
    public void run(){

        for(int i=0;i<10;i++){

            System.out.println("Thread is Running");

        }
    }
}
public class thred_example {
    public static void main(String[] args) {
        mythread obj = new mythread();
        obj.start();
    }
}