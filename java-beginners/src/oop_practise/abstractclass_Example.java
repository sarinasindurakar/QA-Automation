package oop_practise;
abstract class parent{

    public parent(){
        System.out.println("hello");
    }


    abstract public void parent();

}
class child extends parent{
    public void parent(){
        System.out.println("This is abstract parent methods");
    }


}

public class abstractclass_Example {
    public static void main(String[] args) {
        child obj=new child();
        obj.parent();

    }

}
