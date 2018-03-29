package ee.tlu.jaagup.liidesed;
import java.util.*;
public class Kilpkonn implements AsukohagaObjekt{
    Map<String, Integer> andmed=new HashMap<>();
    public Kilpkonn(int kx, int ky) {
        andmed.put("x", kx);
        andmed.put("y", ky);
        andmed.put("suund", 1);
    }
    @Override
    public int kysiX() {
        return andmed.get("x");
    }   
    @Override
    public int kysiY() {
        return andmed.get("y");
    }

    int kysiSuund() {
        return andmed.get("suund");
    }

    void keeraParemale() {
        int abi=andmed.get("suund");
        abi++;
        if(abi>4){abi=1;}
        andmed.put("suund", abi);
    }

    void edasi() {
        if(kysiSuund()==1){andmed.put("x",andmed.get("x")+1);}
        if(kysiSuund()==2){andmed.put("y",andmed.get("y")+1);}
        if(kysiSuund()==3){andmed.put("x",andmed.get("x")-1);}
        if(kysiSuund()==4){andmed.put("y",andmed.get("y")-1);}
    }
    
    Koht jargmineKoht(){
       if(kysiSuund()==1){return new Koht(kysiX()+1, kysiY());}
       if(kysiSuund()==2){return new Koht(kysiX(), kysiY()+1);}
       if(kysiSuund()==3){return new Koht(kysiX()-1, kysiY());}
       if(kysiSuund()==4){return new Koht(kysiX(), kysiY()-1);}
       return new Koht(kysiX(), kysiY());
    }
    
    @Override
    public String toString(){
       if(kysiSuund()==1){return ">";}
       if(kysiSuund()==2){return "v";}
       if(kysiSuund()==3){return "<";}
       if(kysiSuund()==4){return "^";}
       return "?";
    }
}
