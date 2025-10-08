package ListInterface.ArrayList;
import java.util.ArrayList;

public class ArrayListUses {
    public static void main(String[] args) {

        ArrayList <String> states = new ArrayList <String>();

    // Now adding the element in the ArrayList
        // add( element); add the element at the end of the list
        // add ( index , element ); add the element at the spcific position

        states.add("Maharastra");
        states.add("Tamil Nadu");
        states.add("Kerala");
        states.add("Dehli");
        states.add("Gujarata");

    // The second way of the adding the element in spcefic position
        // Note In array and ArrayList index start with the 0
        //

        states.add( 0 ,"Karnataka");
        states.add(2,"UP");
        states.add(4,"Bihar");


    //To Print the all element in the ArrayList
        System.out.println(states);


    //  To check the how many  element in the arrayList
        System.out.println("The Number of element Present in the ArrayList is: " +states.size());

    //To get the perticular element in ArrayList
        System.out.println(states.getFirst()); // it return the First  element of  the array
        System.out.println(states.getLast()); // it return the last element oft the array

        // set method is used to set the element
         states.set(1,"Bihar");
         /*
                    the  position or index  of the perticular element will remove
                     or then add new element that position
          */
       // System.out.println(states.set(1,"Bihar"));
        System.out.println(states);


    // To remove the specific element in ArrayList
        //states.removeFirst();
        //states.removeLast();
        System.out.println(states.remove(6));
        // System.out.println(states);


    //To remove the all the elemnet at a time use the clear();
        states.clear();
        System.out.println(states); // In the output it will  give the empty ArrayList

    }
}
