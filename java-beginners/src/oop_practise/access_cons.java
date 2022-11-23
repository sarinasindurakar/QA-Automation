package oop_practise;
class cylinder{
    private int height ;
    private int radius;


    public int getHeight(){
        return height;
    }
    public void setheight(int height){
        this.height=height;
    }
    public int getRadius(){
        return radius;
    }
    public void setradius(int radius){
        this.radius=radius;
    }

     public double surface(){

        return radius*height;
     }
}

public class access_cons {

    public static void main(String[] args){
        cylinder obj=new cylinder();
        obj.setheight(12);
        obj.setradius(2);
        System.out.println("the surafce is "+obj.surface());


    }
}
