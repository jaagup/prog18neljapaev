package ee.tlu.jaagup.liidesed;
import java.util.*;
class Ala {

    Kilpkonn k;
    char[][] m;
    List<AsukohagaObjekt> objektid=new ArrayList<>();
    
    Ala(int laius, int korgus) {
        k = new Kilpkonn(0, 0);
        objektid.add(k);
        m = new char[laius][korgus];
        for (int y = 0; y < m[0].length; y++) {
            for (int x = 0; x < m.length; x++) {
                m[x][y]='.';
            }
        }
        m[k.kysiX()][k.kysiY()]=k.toString().charAt(0);
    }
    
    public boolean kasVaba(int x, int y){
        if(x<0){return false;}
        if(y<0){return false;}
        if(x>=m.length){return false;}
        if(y>=m[0].length){return false;}
        for(AsukohagaObjekt obj: objektid){
           if(obj.kysiX()==x && obj.kysiY()==y){return false;}
        }
      /*if (!objektid.stream().noneMatch((obj) -> (obj.kysiX()==x && obj.kysiY()==y))) {
            return false;
        }*/        
        return true;
    }
    //Lisage paar testi - vaba, alast väljas, kilpkonnal pihtas

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < m[0].length; y++) {
            for (int x = 0; x < m.length; x++) {
                sb.append(m[x][y]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public void k2sk(char korraldus){
       if(korraldus=='e'){
          m[k.kysiX()][k.kysiY()]='*';
          k.edasi();
       }
       if(korraldus=='p'){
          k.keeraParemale();
       }
       m[k.kysiX()][k.kysiY()]=k.toString().charAt(0);
    }
    public void k2sud(String s){
       for(int i=0; i<s.length(); i++){
          k2sk(s.charAt(i));
       }
    }
    public Kilpkonn kysiKilpkonn() {
        return k;
    }

}
