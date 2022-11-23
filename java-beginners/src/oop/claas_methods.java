package oop;

import java.util.Scanner;

public class claas_methods {
    public void name(){

        Scanner  scanner=new Scanner(System.in);
         String name=scanner.nextLine();
        System.out.println("the name is" +name);


    }
        public void age(){
            Scanner  scanner=new Scanner(System.in);
           int age=scanner.nextInt();
           System.out.println("the age of "+age);

        }
    public static void main(String[] args){
        claas_methods obj=new claas_methods();
        obj.name();
        obj.age();

    }

    }

