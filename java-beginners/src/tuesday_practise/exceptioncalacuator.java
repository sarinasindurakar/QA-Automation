package tuesday_practise;
class invalidexception extends Exception{
    @Override
    public String toString() {
        return"cannot add";
    }

    @Override
    public String getMessage() {
        return"I am getmessage()";
    }
}
class MaxInputException extends Exception {
    @Override

    public String toString() {
        return"Input cannot be greater than 1000";
    }

    @Override
    public String getMessage() {
        return"I am getmessage()";
    }

}
class  cannotdividebyzeroException extends Exception {
    public String toString(){
        return "cannot divideby zero";
    }
    public String getMessage(){
        return "I am getmessage()";
    }

}
class  MaxMultiplyException extends Exception {
    public String toString(){
        return "canot be greater than 7000";
    }
    public String getMessage(){
        return "I am getmessage()";
    }

}
class calculator{
    double add(double a,double b)throws invalidexception,MaxInputException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        }

        if(a==8 || b==9){
            throw new invalidexception();
        }
        return a+b;
    }
    double sub(double a,double b)throws MaxInputException{
        if(a>1000|| b>1000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double mul(double a,double b)throws MaxInputException,MaxMultiplyException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        } else if (a>7000||b>7000) {
            throw new MaxMultiplyException();
        }

        return a*b;
    }
    double divide(double a,double b)throws MaxInputException,cannotdividebyzeroException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        }
        if(b==0) {
            throw new cannotdividebyzeroException();
        }
        return a/b;
    }


}

    public class exceptioncalacuator {
    public static void main(String[] args)throws MaxMultiplyException,MaxInputException,cannotdividebyzeroException,invalidexception {
        calculator obj=new calculator();
       /// obj.add(8,9);
        obj.sub(2000,5000);
       //obj.divide(20,0);
        //obj.mul(5, 9888);

    }
}
