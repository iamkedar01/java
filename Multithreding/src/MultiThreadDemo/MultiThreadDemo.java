package MultiThreadDemo;

class ThreadX extends Thread {
    public void run(){
        Thread t = Thread.currentThread();
        t.setName("Thread - X");
        for(int i=1 ; i<=10;i++){
            System.out.println(t.getName() +":" + i);
        }
    }
}

class ThreadY extends Thread{
    public void run(){
        Thread  t = Thread.currentThread();
        t.setName("Thread - Y");
        for(int i=10;i>0;i--){ // Always check here the condition some time it gives the logical error
            System.out.println(t.getName()+":"+i);
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        ThreadX t1 = new ThreadX();
        t1.start();

        ThreadY t2 = new ThreadY();
        t2.start();

    }
}
// Note : if don't call the start() method it excecuted  as normal program
// we can observe  the variation in the output bcz the thread will excecuted based on the CPU time it is not control in by programer


