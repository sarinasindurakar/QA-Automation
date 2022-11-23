package oop_practise;
class cellphone_func{
    public void ringing(){
        System.out.println("Phone is Ringing...");
    }
    public void vibrating(){
        System.out.println("Phone is Vibrating...");
    }

}

public class cellphone {
    public static void main(String[] args){
        cellphone_func obj=new cellphone_func();
        obj.ringing();
        obj.vibrating();
    }
}
