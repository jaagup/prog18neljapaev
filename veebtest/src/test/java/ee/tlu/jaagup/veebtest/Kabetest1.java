package ee.tlu.jaagup.veebtest;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class Kabetest1 {
   @Test
   public void avamine(){
       open("http://www.tlu.ee/~jaagup/veeb1/kabe1.html");
       $("h1").shouldHave(text("Kabe"));
   }
}
