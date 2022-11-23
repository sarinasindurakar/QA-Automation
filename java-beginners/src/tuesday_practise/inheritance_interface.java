package tuesday_practise;
interface parents{
    void meth1();
    void meth2();
}
interface children extends parents{
    void meth3();
    void meth4();
}
class family{
    void meth1(){
        System.out.println("It is method 1");
    }
    void meth2(){
        System.out.println("It is method 2");
    }
    void meth3(){
        System.out.println("It is method 3");
    }
    void meth4(){
        System.out.println("It is method 4");
    }

}

public interface inheritance_interface {
    public static void main(String[] args) {
        family obj=new family();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
