package oop_practise;

import java.util.Random;
import java.util.Scanner;

class numbers{
    int num;
    int x;
    boolean value;
    public int noofguess=0;
    public int noofguess(){
        return noofguess;

    }
    public void setnoofguess(int noofguess){
        this.noofguess=noofguess;

    }
    public void randomnumbers(){
        Random rand=new Random();
         this.x=rand.nextInt(10);
         System.out.println(x);
    }
    public void takeuserinput(){
        System.out.println("Guess the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
    }
    boolean iscorrectnumber(){
        noofguess++;
        if(num==x){
            System.out.println("Right guessed");
            return true;
        } else if (num<x) {
            System.out.println("Guessed too low");
            return true;

        } else if (num>x) {
            System.out.println("Guessed too high");
            return true;

        }
        else{
            return false;
        }
    }
}
public class guessnumber {
    public static void main(String[] args){
        numbers obj =new numbers();
        //System.out.println(obj.randomnumbers());
        obj.randomnumbers();
        boolean b=false;
        while(!b){
            obj.takeuserinput();
            b=obj.iscorrectnumber();
        }
        obj.noofguess();
        /*
        obj.randomnumbers();
       System.out.println("The random number is"+obj.x);
       obj.takeuserinput();
        System.out.println("The number is"+obj.num);
        obj.iscorrectnumber();
        System.out.println("The number is"+obj.value);

*/


    }
}
