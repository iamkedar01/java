package ListInterface.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
         ArrayList <Double> Nums = new ArrayList <Double> ();
         Nums.add(25.3);
         Nums.add(24.9);
         Nums.add(24.1);
         Nums.add(25.1);
         Nums.add(10.0);
         Nums.add(9.8);
        System.out.println(Nums);

    // To sort the ArrayList we need to import the collection Package
          Collections.sort(Nums);

        // printing useing the for each loop
        for (Double num : Nums){
            System.out.print(num + " ");
        }
    }
}
