package ListInterface.ArrayList;
 import java.util.*; // All the collections Interface are present in the java.util package
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add("xxx");
        al.add("yyy");
        System.out.println(al); // [10, 20, xxx, yyy]
        al.add(2,"KKK");
        System.out.println(al);// [10, 20, KKK, xxx, yyy]
        al.set(2,"BBB");
        System.out.println(al); // [10, 20, BBB, xxx, yyy]
        al.remove(2);
        System.out.println(al); // [10, 20, xxx, yyy]
        al.remove("xxx"); // [10, 20, yyy]
        System.out.println(al);
        String s = (String) al.get(2); // Here Type casteing
        System.out.println(s);//yyy
        System.out.println("The Size of the ArrayList is :"+al.size());// 3
}
}
// NOTE : Converting respective primitive type into reference type or vice-versa automatically.
// This feature is known as the autoboxing - this is added in the java version - 5
