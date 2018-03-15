package ee.tlu.jaagup.automaattestid;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
public class AlaTestid {
    public AlaTestid() {}
    Ala a;  
    @Before
    public void setUp(){
       a=new Ala(10, 10);  
    }
    @Test public void loomine(){
       assertThat(a.kysiKilpkonn().kysiX(), is(0));
       assertThat(a.toString(), is(
               ">.........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n")
       );
    }
    @Test public void liikumine1(){
       a.k2sk('e'); 
       assertThat(a.toString(), is(
               "*>........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n")
       );
    }
    @Test public void liikumine2(){
       a.k2sud("eepee");  
       assertThat(a.toString(), is(
               "***.......\n"+
               "..*.......\n"+
               "..v.......\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n"+
               "..........\n")
       );
    }

}
