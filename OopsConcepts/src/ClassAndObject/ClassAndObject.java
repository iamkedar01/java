package ClassAndObject;
class Pen { // Here the class name starting letter must be in capital
    String color;
    String type;
    // here two variable are created  to in pen class
    public  void  write(){
        System.out.println(" \nIt is used to write something.");
        // this is the method  used in the pen class

    }
    public void info(){
        System.out.println("The pen color is "+ color);
        System.out.println("The pen Type is "+ type);
    }

}
    public class ClassAndObject {
        public static void main(String[] args ){
            // TO accees any class we need to create a Object
            // Classname Variable_name = new Classname();
        /*  Explination about the object creation
        1)----> Here we need to give the same class name as created
        2)----> Variable name You can give whatever you want best methods is give related
        3)----> new Keyword its is used to creation of the object whenever
                you see the new keyword it means some object  creation is happening their
        4)----> In last same as the Classname and () with two brackets as given in the syntax
                its is known as the Constructor java autometically created a default constructor
         */
            Pen pen1 = new Pen();
            pen1.color = "red";
            pen1.type = "gel";
            pen1.write();
            pen1.info();

            // here we can give the values in two types one is as given in the above
            //Now i created a another object of the same class we can create N number of the object of the same class
            //    Pen pen2 = new Pen("Black","Ballpoint");
            Pen pen2 = new Pen();
            pen2.color="black";
            pen2.type="ballpen";
            pen2.write();
            pen2.info();
            //  the statured way of the calling method inside the class after the object creation call the requried method.
            // in this example only use the one method only we create a n number of the method inside the class



            // this the way of the method calling

        }
    }


