package ee.tlu.jaagup.klassikomplekt;
import static org.mockito.Mockito.*;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
public class Proov2 {
    public static void main(String[] arg){
       Vagun v1=mock(Vagun.class);
       Answer vastusef=new Answer<Integer>(){
           @Override
           public Integer answer(InvocationOnMock inv) throws Throwable{
              int sisend=inv.getArgumentAt(0, Integer.class);
              return -sisend;
           }
       };
       when(v1.tagasi(anyInt())).thenAnswer(vastusef);
       System.out.println(v1.tagasi(3));
    }    
}
