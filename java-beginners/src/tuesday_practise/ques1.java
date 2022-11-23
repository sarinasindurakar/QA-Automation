package tuesday_practise;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainppen extends pen{
    public void write(){
        System.out.println("It is writing");
    }
    public void refill(){
        System.out.println("It is refilling");
    }
    public void changeNib(){
        System.out.println("changing Nib");
    }
}

class monkey{
    public void jump(){
        System.out.println("jumping");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}
interface  basicanimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimal{
    public void eat(){
        System.out.println("eating...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
}
public class ques1 {
    public static void main(String[] args) {
        fountainppen obj=new fountainppen();
        obj.write();
        obj.refill();
        obj.changeNib();
        monkey m=new human();
        m.jump();
        m.bite();
        //m.eat();//cant



        basicanimal an=new human();
        an.eat();
        an.sleep();

    }
}
