package tuesday_practise;
class animals{
    public void mammal(){
        System.out.println("It is mammal fandom");
    }
}
class dog extends animals{
    public void animalsound(){
        System.out.println("It ia barking");
    }

}
public class polymorphism_example
{
    public static void main(String[] args) {
        dog obj=new dog();
        obj.animalsound();
        animals obj1=new animals();
        obj1.mammal();
       // obj1.animalsounds();//cant  access this cause obj1 in object of animal class and method is of another class


    }
}
