package oop_practise;

import java.util.Scanner;

class square{
    int s;
    public int setside(){
        Scanner sc= new Scanner(System.in);
        s=sc.nextInt();
        return s;
    }
    public int area(){
        return s*s;

    }
    public int perimeter(){
        return 4*s;
    }

}

public class square_math {
    public static void main(String[] args){
        int s;
        square obj=new square();
        System.out.println("the side is :"+obj.setside());
        System.out.println("the area is :"+obj.area());
        System.out.println("the permieter is :"+obj.perimeter());
    }
}
