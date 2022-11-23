package oop_practise;
class phone{
    public void name(){
        System.out.println("It is tuktuk");
    }
    public void on(){
        System.out.println("ONNNNN");
    }
}
class Smartphone extends phone{

    public void on(){
        System.out.println("smartphone is onn");
    }
}

public class dynamicmethod {
    public static void main(String[] args) {
        phone obj=new Smartphone();
        obj.name();
        obj.on();

    }
}
