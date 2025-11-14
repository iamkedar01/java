package ThreadClass;// this the user defined package named as the threadclass

// the tread is belong to the java.util.lang package  it will automattically called by java



class MyThread extends Thread { // it will not give the any compile time error bcz  Thread is concrete class (fully implemented, not abstract
// Nothing need to be override as programmer we need to override method run method

    public void run(){ // This method is already present in the Thread super class now here override the  method again
        System.out.println("I am a Thread ");

        Thread t = Thread.currentThread();// it will give the thread name and priority  and branch of the thread
        System.out.println(t); // Here inside the toString method is called to print the output like this ( Thread[#31,Thread-1,5,main] )
        // it will show the thread name along with id or number like thread -0

    // now the explintion about the Thread  methods in details
    // the already one is explained that is Current thread
    t.setName("MyThread");
        System.out.println(t);  // Thread[#30,MyThread,5,main]

        System.out.println(t.getName()); // MyThread

    t.setPriority(8); // it will set the priority of the thread between 1 to 10 what will you give
        System.out.println(t); //Thread[#30,MyThread,8,main] you can the number 8 here
        System.out.println(t.getPriority());  // it will give the priority number only in the output

// Note if give the priority more then 10 give the IllegalArgumentException its is the subclass of the RuntimeException those are the Unchecked Exception
        // all the runtime exception are the Unchecked exception

    }
}


public class ThreadMethodDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread(); // object is created
        t.start(); // when call the start() method useing the object then only the thread created
        //otherwise it run as the normal programm
        // In simple  it create the thread and invokes run() method

//        MyThread t1 =new MyThread();
//        t1.start();  //  this is the second Object of the MyThread class

        /*
        Thread[#30,Thread-0,5,main] // To print output like this toString invoked the automatically
        Thread[#31,Thread-1,5,main]
         Three is no gurrenty of the runing the order of the thread bcz it is depends on the cpu runtime
         the work of the programer or our is push the thread to the run method is depends on the cy
         */


    }
}

// Note: when useing  the class and interface  without importing the any package means those are belong to the java.util.lang package  which is already  imported by defaul// t

// when you want to create the thread first you need to call the start() method then only the thread will create
// after that you verify the thread creation useing the run() method