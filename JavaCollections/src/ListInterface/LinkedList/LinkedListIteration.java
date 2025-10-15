package ListInterface.LinkedList;
import java.util.LinkedList;

public class LinkedListIteration {
        public static void main(String[] args) {
            LinkedList<String> fruits = new LinkedList<>();

            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");

            System.out.println("LinkedList Elements:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

//            for(int i = 0; i<fruits.size();i++) {
//                System.out.println("List elements: " + fruits.get(i));
//            }

            // Accessing element
            System.out.println("Second element: " + fruits.get(1));
        }
    }