package oop_practise;
interface house{
    public void houselocation();
    public void  housenumber();

}
interface housing{
    public void name();
    public void builtyear();
}
class housemembers implements house,housing{
    public void houselocation(){
        System.out.println("the houselocation is in  Dallu");
    }
    public void housenumber(){
        System.out.println("the housenumber is 1213 ");
    }
    public void name(){
        System.out.println("the housename is jjsj ");
    }
    public void builtyear(){
        System.out.println("the builtyear is 2017");
    }
}

public class example_interface {
    public static void main(String[] args) {
        housemembers obj=new housemembers();
        obj.houselocation();
        obj.housenumber();
        obj.builtyear();
        obj.name();
    }
}
