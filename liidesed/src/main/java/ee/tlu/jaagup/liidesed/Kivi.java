package ee.tlu.jaagup.liidesed;
public class Kivi extends Koht{
    public Kivi(int x, int y){
      super(x, y);
    }
    @Override
    public String toString(){
       return "o ("+x+", "+y+")";
    }
}
