package CheckedException;

//- Otherthan Runtime Exceptions like IOException, SQLException, user defined exceptions ets
//are checked exceptions
//- If a method throws an exception then this method need to be caught (try and catch)
//or declared to be thrown (throws)

import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start of the programm");
        // we will got the IOException must be caught or declared to be thrown
        // int  n = System.in.read();

        try {
            int  n = System.in.read();
        } catch (IOException e) {
            System.err.println("IOE error "+ e);
            throw new RuntimeException(e);
        }
       // note Handele useing the try and  catch and throw  blocks
    }
}
