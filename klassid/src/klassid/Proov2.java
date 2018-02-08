package klassid;
public class Proov2 {
  public static void main(String[] arg){
     Pall[] pallid=new Pall[3];
     pallid[0]=new Pall(3, 5);
     pallid[1]=new Pall(4, 6);
     pallid[2]=new Pall(-10, 8, 2);
     for(int i=0; i<pallid.length; i++){
        System.out.println(pallid[i]);
        //Kuvage koordinaatide algustpunktist kõige kaugema palli andmed
     }
  }    
}
