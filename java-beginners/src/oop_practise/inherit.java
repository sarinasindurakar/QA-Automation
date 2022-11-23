package oop_practise;
class pet{
    pet(){
        System.out.println("This is pet");
    }
    pet( int x ){
        System.out.println("this is argument "+x);

    }

}
class animal extends pet{
    animal(){
       // super(0);
        System.out.println("This is animal");
    }
    animal(int x,int y){
        super(x);
        System.out.println("The value of arguement y is "+y);
    }

}

/*
class vehicle{
    public void name(){
        String name="sds";
        System.out.println(name);
    }
    public void model(){
        int model=121;
        System.out.println(model);
    }
}
class car extends vehicle{
    public void price(){
        int price=343;
        System.out.println(price);
    }
}

 */

public class inherit {
    public static void main(String[] args) {
       /*
        car obj=new car();
        obj.price();
        vehicle ob2=new vehicle();
        ob2.name();

        */

       // animal obj=new animal();
        animal obj=new animal( 2,6);
    }
}
