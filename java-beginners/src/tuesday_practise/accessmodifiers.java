package tuesday_practise;
class access{
    public int x=5;
    private int y=4;
    protected  int z =6;
    int k=1;
    public void accessmethod(){
        System.out.println(k);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

public class accessmodifiers {
    public static void main(String[] args) {
        access c1= new access();
        //c1.accessmethod();
        System.out.println(c1.k);
        System.out.println(c1.x);
       // System.out.println(c1.y);
        System.out.println(c1.z);


    }
}
