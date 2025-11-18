package Synchronization;
class ThreadSum extends Thread {
    int sum;
    public void run(){
        for(int i=1;i<=100;i++){
            sum =sum + i;
            synchronized (this){ // In this method we pass the current object   or data
                notify(); // this is used to notify the after  complition of the work
            }
        }
    }
}
public class InterThreadDemo {
    public static void main(String[] args)throws InterruptedException { // Here we handle the exception
        ThreadSum ts = new ThreadSum();
        ts.start();
        synchronized (ts) { // here we pass the object variable
            ts.wait();
        }
        System.out.println("Sum is : "+ts.sum);
        // The CPU will dircltly excecuteing the  this line first and completeing the program to stop this we will use the wait method
        // Note that this wait and notify  method always call inside the synchronized method only otherwise program will raise the illegalException

    }
}
// how it works mean first it will enter the// Runnable State - main Thread , ts thread this two defend on the CPU time
