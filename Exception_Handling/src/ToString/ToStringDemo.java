package ToString;

class Product{  // it extends the object class
    // In java the main class is object class it is internally product class extends the object class which is present in the java.lang package
    int pid;
    String pname;
    double price;

    Product(int pid , String pname , double price){ // Parameter Constructor
        this.pid =pid;
        this.pname = pname ;
        this.price = price;
    }
    Product( ){}// default Constructor
    public String toString(){ // here we override the toString method which is present in the object class
        return pid+ " " + pname +" "+ price; // now it will give the exact value in output
    }

}

public class ToStringDemo {
    public static void main(String[] args) {
        Product prod = new Product(111,"monitor",5000.0);
        // if we don't use the tostring method. In output it will give the Classnamealong with Hashvalue or Hashcode like this ToString.Product@6acbcfc0
        System.out.println(prod);
        // toString() is invoked implicitly” means that the toString() method of an object is called automatically by the Java runtime,
        // even though you did not write .toString() explicitly in your code.

        Product p1 = new Product(121 , "Keyboard" , 200);
        System.out.println(p1);

        // this will work with the many number of the object
    }

}
