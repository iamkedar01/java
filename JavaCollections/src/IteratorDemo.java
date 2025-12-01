import java.util.HashMap;
import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        HashMap<String , Integer > hm = new HashMap<String, Integer >();
        // The Hash map not maintain the order but store the value in the key pair
        // when you run the program every time it will give the different output
        hm.put("monitor" , 5000);
        hm.put("mouse" , 1000);
        hm.put("Ups" , 2000);
        hm.put("Keyboard",8000);
        hm.put("Speakers ", 9000);
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for(String key :keys){
            System.out.println(key+":"+hm.get(key));
        }

    }
}
