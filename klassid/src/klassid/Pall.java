package klassid;

public class Pall {
   protected double x;    
   protected double y;    
   protected double r;
   //Lisage pallile raadius
   //Lisage käsk kontrollimaks, kas kaks palli puutuvad kokku
   
   public Pall(double x, double y, double r){
       this.x=x;
       this.y=y;
       this.r=r;
   }
   
   public Pall(double x, double y){
       this(x, y, 1);
   }
   public boolean kasPuutub(Pall teine){
       return kaugusPallist(teine)<this.getR()+teine.getR();
   }
   public double kaugusNullist(){
      return Math.sqrt(x*x+y*y); //käivitage
   }
   public double getX(){return x;}
   public double getY(){return y;}
   public double getR(){return r;}
   public double kaugusPallist(Pall teine){
       double dx=getX()-teine.getX();
       double dy=getY()-teine.getY();
       return Math.sqrt(dx*dx+dy*dy);
   }
   @Override
   public String toString(){
      return "Pall kohal ("+x+", "+y+" - raadius "+r+")";
   }
}
