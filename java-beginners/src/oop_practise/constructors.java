package oop_practise;
 class student{
    public int ids;
    public String names;
    public student(String myName, int myId){
        ids = myId;
        names = myName;
    }

}

public class constructors {
    public static void main(String[] args){
    student obj = new student("sarina",23);
    System.out.println(obj.names+ "\n" +obj.ids);
    }
}
