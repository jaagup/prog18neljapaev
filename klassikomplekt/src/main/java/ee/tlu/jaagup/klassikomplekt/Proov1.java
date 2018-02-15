package ee.tlu.jaagup.klassikomplekt;
import static org.mockito.Mockito.*;
public class Proov1 {
   public static void main(String[] arg){
      Vagun v1=mock(Vagun.class);
      when(v1.kysiAsukoht()).thenReturn(7);
      System.out.println(v1.kysiAsukoht());
   }    
}
