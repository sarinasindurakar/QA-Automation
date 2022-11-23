package tuesday_practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<String>();
        names.add("sarina");
        names.add("Grisha");
        names.add("hari");
        names.add("shyam");
        names.add(0,"subin");
        System.out.println("The array list is:"+names);
        names.remove(3);
        System.out.println("The array list is:"+names);
        System.out.println("The array list index of sarina is:"+ names.indexOf("sarina"));
        System.out.println("The array list is:"+ names.contains("hari"));
        Collections.sort(names);
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        /*
        for (String i : names) {
            System.out.println(i);
        }

         */
    }
}




