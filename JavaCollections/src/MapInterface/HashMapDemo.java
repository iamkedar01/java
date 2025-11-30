package MapInterface;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String , Integer > hm = new HashMap<String, Integer >();
        // The Hash map not maintain the order but store the value in the key pair
        // when you run the program every time it will give the different output
        hm.put("monitor" , 5000);
        hm.put("mouse" , 1000);
        hm.put("Ups" , 2000);
        hm.put("Keyboard",8000);
        hm.put("Speakers ", 9000);
        System.out.println(hm);  // {mouse=1000, Keyboard=8000, Ups=2000, monitor=5000, Speakers =9000}


        LinkedHashMap<String , Integer>  lhm = new LinkedHashMap<>();
        // LinkedHashMap it maintain the insertion order
        lhm.put("monitor" , 5000);
        lhm.put("mouse" , 1000);
        lhm.put("Ups" , 2000);
        lhm.put("Keyboard",8000);
        lhm.put("Speakers ", 9000);
        System.out.println(lhm); // {monitor=5000, mouse=1000, Ups=2000, Keyboard=8000, Speakers =9000}


        TreeMap<String , Integer> tm = new TreeMap<>();
        // it give the element in the sorted order by the alphabet order in hte from of the keys
        tm.put("monitor" , 5000);
        tm.put("mouse" , 1000);
        tm.put("Ups" , 2000);
        tm.put("Keyboard",8000);
        tm.put("Speakers ", 9000);
        System.out.println(tm); // {Keyboard=8000, Speakers =9000, Ups=2000, monitor=5000, mouse=1000}


    }
}
