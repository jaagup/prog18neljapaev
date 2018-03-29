package ee.tlu.jaagup.liidesed;
public class Kivi implements AsukohagaObjekt{
    int x, y;
    public Kivi(int x, int y){
      this.x=x; this.y=y;
    }

    @Override
    public int kysiX() {
       return x;
    }

    @Override
    public int kysiY() {
       return y;
    }
}
