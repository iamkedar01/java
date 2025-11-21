package Synchronization;

class Table{
    // this synchronized keyword used when multiple thread refer the same resource here threadA and ThreadB refer the same Table t
     synchronized void printTable(int n){ // when we made the synchronized method it wait completelly exceution of the one thread
        for(int i=1; i<=10;i++){
            System.out.println(n+" X "+i +"="+(n*i));
        }
    }

}
class ThreadA extends Thread {
    Table t; // it is the data Member or for the reference here class is also data-type here Table is class we takeing the datamember t
    ThreadA(Table t){ // here table object will come and store
        this.t = t;

    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

class  ThreadB extends Thread{
    Table t;
    ThreadB(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(8);
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        Table t = new Table();
        ThreadA t1 = new ThreadA(t); // here we passing the object of the table class to the t1 object
        t1.start();
        ThreadB t2 = new ThreadB(t);
        t2.start();
         // In this example two different class refering the same object so you can obserive the output is not proper
    }

}
// In the above class used the three class and one main class



