import java.util.LinkedList;

/*
    Genric are mainly used for the collection  for similar datatype
    it's also maintain the similar datatype
 */
public class GenericCollection {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        // here Integer is wrapper class whcih convert the primitive datatype into a object
         // In the above arrayList we can store only integer data only
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(20); // note it allow the duplicate elements in LinkedList
        // here useing the for each loop
        for(Integer number :ll){
            System.out.print(number+" ");
        }
    }
}
