
package ee.tlu.jaagup.klassikomplekt;

public class Proov3 {
    public static void main(String[] arg){
      Pallivise mang1=new Pallivise();
      mang1.alusta();
      /*for(int i=0; i<20; i++){
         mang1.liigu();         
      }*/
      while(mang1.kysiSeisund()==Seisundid.ALUSTATUD){
        mang1.liigu();
      }
    }
}
