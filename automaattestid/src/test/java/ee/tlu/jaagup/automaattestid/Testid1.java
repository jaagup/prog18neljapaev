package ee.tlu.jaagup.automaattestid;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testid1 {
    
    public Testid1() {
    }
    @Test
    public void esimene(){
        assertEquals(5, 3+2); 
    }    
    @Test public void teine(){
       Kilpkonn k=new Kilpkonn(3, 5);
       assertEquals(3, k.kysiX());
    }
}
