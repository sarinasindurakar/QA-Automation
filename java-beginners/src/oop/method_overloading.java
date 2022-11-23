package oop;

public class method_overloading {
    static int addition(int x,int y)
    {
        return(x+y);
    }
    static double addition(double x,double y,double z){
        return(x+y+z);
    }
    public static void main(String[] args) {
        System.out.println(addition(2,3));
        System.out.println(addition(2.3,4.5,6.7));

    }
}
