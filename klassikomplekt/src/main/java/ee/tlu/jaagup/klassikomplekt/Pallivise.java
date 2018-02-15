package ee.tlu.jaagup.klassikomplekt;
public class Pallivise {
   Pall lendaja;
   Pall sihtkoht;
   void alusta(){
      lendaja=new Pall(10, 200, 10);
      sihtkoht=new Pall(250, 120, 20);
   }
   boolean kasPihtas(){
      return lendaja.kasPuutub(sihtkoht);
   }
   void liigu(){
      lendaja.liigu();
      System.out.println(lendaja +" "+kasPihtas());
   }
}
//Koostage eraldi prooviprogramm, kus määratakse lendajale samm
//ning näidatakse 20 sammu juures lendaja koordinaadid ja tabamus
