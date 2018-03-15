package ee.tlu.jaagup.automaattestid;
public class Kilpkonn {
    int x;
    int y;
    int suund=1;
    public Kilpkonn(int kx, int ky) {
        x=kx;
        y=ky;
    }
    int kysiX() {
        return x;
    }   

    int kysiY() {
        return y;
    }

    int kysiSuund() {
        return suund;
    }

    void keeraParemale() {
        suund++;
        if(suund>4){suund=1;}
    }

    void edasi() {
        if(suund==1){x++;}
        if(suund==2){y++;}
        if(suund==3){x--;}
        if(suund==4){y--;}
    }
}
