package RunableInterfaceInThread;

class ThreadR implements Runnable{ // when we use this it will give the error bcs we must override the run method


    @Override // This is an Annotations - added in java 5 Version when you see the @ this symbol mean it is an Annotation
    public void run() {
        for(int i =1 ; i<=10 ;i++){
            System.out.print(i+ " ");
        }
    }
}

public class RunableDemo {
    public static void main(String[] args) {
        ThreadR r1 = new ThreadR();
        // r1.start();
        // if you write the start method it will give the error to overcame that,
        // we crate the Thread object and pass the ThreadR method ObjectVariable as a parameter to the Thread
        // Then you will get the output
        Thread t = new Thread(r1); //
        t.start();
    }
}
