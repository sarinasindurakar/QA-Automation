package tuesday_practise;

interface mycamera{
    void takesnap();
    void recordvideo();

}
interface mywifi{
    String[] getnetworks();
    void connecttonetwork(String networks);
}
class mycellphone{
    public void calling(){
        System.out.println("calling...");
    }
    public void ringing(){
        System.out.println("Ringing...");
    }



}
class smartphone extends mycellphone implements mycamera,mywifi{
    public void takesnap(){
        System.out.println("Taking Snap...");
    }
    public void recordvideo(){
        System.out.println("Recording video...");
    }
    public  String[] getnetworks(){
        System.out.println("Getting the list of networks");
        String[] networklist={"sarina","hello","bye"};
        return networklist;
    }
    public void connecttonetwork(String networks){
        System.out.println("Connecting to network"+networks);
    }

}

public interface camera_interface_Example {
    public static void main(String[] args) {
        smartphone obj=new smartphone();

        String [] as =obj.getnetworks();
        for (String item:as){
            System.out.println(item);
        }

    }
}


