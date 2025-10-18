package ListInterface.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSort {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<String> fruits = new LinkedList<>();

        numbers.add(101);
        numbers.add(32);
        numbers.add(93);
        numbers.add(48);
        numbers.add(51);

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("LinkedList Elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        Collections.sort(numbers);
        for(int num :numbers){
            System.out.println( num);
        }
}
}

