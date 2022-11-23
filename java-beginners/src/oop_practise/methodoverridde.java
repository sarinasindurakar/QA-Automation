package oop_practise;

class A{
    public void meth1(){
        System.out.println("It is method 1 of class A");
    }
    public void meth2(){
        System.out.println("It is method 2 of class A");
    }
}
class b extends A {
    @Override
    public void meth1() {
        super.meth1();
    }

    public void meth2(){
        System.out.println("This is method 2 of class B");
    }

}
public class methodoverridde {
    public static void main(String[] args) {
        b obj=new b();
        A obj1=new A();
        obj.meth2();
        obj1.meth2();

    }
}
