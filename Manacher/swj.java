import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class swj {
    public static void b  (int a,int b,int c,int d) throws FileNotFoundException {

            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("hello world");
                }
            });
    }
}
