package oop;

public class java_methods {
    static int addition(int x, int y) {
        return (x + y);
    }

    static void vote(int age) {
        if (age > 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you cannot vote");
        }
    }

    public static void main(String[] args) {

        System.out.println(addition(4, 5));
        vote(12);
    }
}
