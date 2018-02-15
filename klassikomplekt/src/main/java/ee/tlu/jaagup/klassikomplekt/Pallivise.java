package ee.tlu.jaagup.klassikomplekt;
public class Pallivise {
   Pall lendaja;
   Pall sihtkoht;
   Seisundid seisund=Seisundid.ALUSTAMATA;
   void alusta(){
      lendaja=new Pall(10, 200, 10);
      sihtkoht=new Pall(250, 120, 20);
      lendaja.sammuAndmed(2, 1);
      seisund=Seisundid.ALUSTATUD;
   }
   boolean kasPihtas(){
      return lendaja.kasPuutub(sihtkoht);
   }
   void liigu(){
      lendaja.liigu();
      System.out.println(lendaja +" "+kasPihtas());
      if(kasPihtas()){ seisund=Seisundid.PIHTAS;}
      if(lendaja.getX()>sihtkoht.getX() && seisund==Seisundid.ALUSTATUD){
         seisund=Seisundid.M88DAS;
      }
   }
   Seisundid kysiSeisund(){
     return seisund;
   }
}
//Koostage eraldi prooviprogramm, kus määratakse lendajale samm
//ning näidatakse 20 sammu juures lendaja koordinaadid ja tabamus
