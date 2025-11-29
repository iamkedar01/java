package SetInterface;
//note Set not allow the Duplicate elements
import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
      // Note: HashSet not maintain the order of the element
      HashSet hs = new HashSet();
      hs.add("monitor");
      hs.add("Keyboard");
      hs.add("mouse");
      hs.add("Ups");
      hs.add("Speakers");
      System.out.println(hs.add("monitor")); //false
      System.out.println(hs); //[mouse, Keyboard, Ups, monitor, Speakers]

        // LinkedHashSet Maintain the order as you given
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("monitor");
        lhs.add("Keyboard");
        lhs.add("mouse");
        lhs.add("Ups");
        lhs.add("Speakers");
        System.out.println(lhs);//[monitor, Keyboard, mouse, Ups, Speakers]

      // TreeSet element in Ascending order normal if use the descending order
       TreeSet ts = new TreeSet();
        ts.add("monitor");
        ts.add("Keyboard");
        ts.add("mouse");
        ts.add("Ups");
        ts.add("Speakers");
        System.out.println(ts); // [Keyboard, Speakers, Ups, monitor, mouse]
        System.out.println(ts.descendingSet()); // [mouse, monitor, Ups, Speakers, Keyboard]

        // note that  for string it use the alphabetic order
        // for Intger ,Float , Double it use the number

    }
}
