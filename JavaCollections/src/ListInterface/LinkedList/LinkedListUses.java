package ListInterface.LinkedList;
import java.util.LinkedList;
public class LinkedListUses {
    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();
        // Here the declartion of the LinkedList Using the String wrapper CLass as an object

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        // The LinkedList is help full for the faster
        // A LinkedList is a doubly linked list implementation of the List and Deque interfaces.
        // it is used in doublyLinkedList for the Frequent insertions/deletions.

        //  Now adding the element at the begaining of  the List  useing the addFirst  method
        cars.addFirst("Tata");

        // Now  adding the element at the end of the List useing the addLast method
        cars.addLast("KIA");

        // Remove an element from the beginning of the list
        //cars.removeFirst();

        // Remove an element from the end of the list
        // cars.removeLast();

        // Get the element at the beginning of the list
        System.out.println(cars.getFirst());

        // Get the element at the end of the list
        System.out.println(cars.getLast());

        // note that code will not give the proper output until you print the value after  make the changes

        System.out.println(cars); // its gives the whole elements present in the list





    }
}
