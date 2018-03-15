package ee.tlu.jaagup.automaattestid;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class Testid1 {
    
    public Testid1() {
    }
    @Test
    public void esimene(){
        assertEquals(5, 3+2); 
    }    
    Kilpkonn k;
    @Before
    public void setUp(){
       k=new Kilpkonn(3, 5);
       //System.out.println("Loodi kilpkonn");
    }    
    @Test public void loomine(){
       assertEquals(3, k.kysiX());
       assertEquals(5, k.kysiY());
       assertEquals(1, k.kysiSuund()); 
       //Lisage test ja kood ka y-koordinaadi tarbeks
    }
    @Test public void keeramine(){
       assertEquals(1, k.kysiSuund()); 
       k.keeraParemale(); 
       assertEquals(2, k.kysiSuund()); 
    }
}
