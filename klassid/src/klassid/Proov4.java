package klassid;
import java.io.*;
public class Proov4 {
    public static void main(String[] args) throws Exception{
       PrintWriter pw=new PrintWriter(new FileWriter("f1.txt"));
       pw.println(new Pall(3, 5, 2));
       pw.close();
    }
}
