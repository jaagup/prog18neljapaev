package ee.tlu.jaagup.klassikomplekt;

public class Pall {
   protected double x;    
   protected double y;    
   protected double r;
   protected double dx;
   protected double dy;
   
   public Pall(double x, double y, double r){
       this.x=x;
       this.y=y;
       this.r=r;
   }
   
   public Pall(double x, double y){
       this(x, y, 1);
   }
      public void sammuAndmed(double dx, double dy){
      this.dx=dx; this.dy=dy;
   }
   public void sammuNurgaAndmed(double nurk, double sammupikkus){
      this.sammuAndmed(sammupikkus*Math.cos(Math.toRadians(nurk)),
              sammupikkus*Math.sin(Math.toRadians(nurk)));
   }
   public void liigu(){ 
      x+=dx; y+=dy;
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
      return "Pall kohal ("+x+", "+y+" - raadius "+r+", samm "+dx+" "+dy+")";

   }
}
