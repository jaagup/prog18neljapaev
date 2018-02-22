package ee.tlu.jaagup.vorkandmed;
import java.net.*;
import java.io.*;
public class Vork1 {
    public static void main(String[] arg) throws Exception{
       String aadress="http://www.tlu.ee/~jaagup/andmed/muu/ounad/antoonovka2.txt";
       BufferedReader br=new BufferedReader(new InputStreamReader(
          new URL(aadress).openStream()
       ));
       String rida=br.readLine();
       System.out.println("Tulbad: "+rida);
       rida=br.readLine();
       while(rida!=null){
          String[] m=rida.split(",");
          System.out.println(m[0]);
          rida=br.readLine();
       }
       br.close();
    }
}
