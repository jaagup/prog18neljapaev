package klassid;
public class Proov2 {
  public static void main(String[] arg){
     Pall[] pallid=new Pall[3];
     pallid[0]=new Pall(3, 5);
     pallid[1]=new Pall(4, 6);
     pallid[2]=new Pall(-10, 8, 2);
     int kaugeim=0;
     for(int i=0; i<pallid.length; i++){
        System.out.println(pallid[i]);
        if(pallid[i].kaugusNullist()>pallid[kaugeim].kaugusNullist()){
           kaugeim=i;
        }
        //Kuvage koordinaatide alguspunktist kõige kaugema palli andmed
     }
     System.out.println("Kaugeim: "+pallid[kaugeim]);
     Pall kaugeimPall=pallid[0];
     for(Pall p: pallid){
       if(p.kaugusNullist()>kaugeimPall.kaugusNullist()){
         kaugeimPall=p;
       }
     }
     System.out.println("Kaugeim pall: "+kaugeimPall);
  }    
}
