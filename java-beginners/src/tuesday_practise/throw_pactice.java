package tuesday_practise;
class radiusexception extends Exception{
    @Override
    public String toString() {
        return"radius negative";
    }

    @Override
    public String getMessage() {
        return "radius cannot be negative";
    }
}
public class throw_pactice {
    public static double area(int r) throws radiusexception{
        if (r<0){
            throw new radiusexception();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static void main(String[] args) {
        try{
//
            double ar = area(-6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
