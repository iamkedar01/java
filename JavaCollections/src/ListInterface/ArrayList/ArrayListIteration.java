package ListInterface.ArrayList;
import java.util.ArrayList;
public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList <Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(10);
        Numbers.add(15);
        Numbers.add(20);
        Numbers.add(25);


        // useing the for loop
//        for( int i =0 ; i <Numbers.size();i++){
//            //System.out.println(i); // it will print the index number
//            System.out.println(Numbers.get(i));
//        }

    //  here the another diffrent way printing the same number
        for (Integer num : Numbers){
            System.out.println(num);
        }

    }
}
