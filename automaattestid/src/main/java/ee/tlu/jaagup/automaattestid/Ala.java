package ee.tlu.jaagup.automaattestid;

class Ala {

    Kilpkonn k;
    char[][] m;

    Ala(int laius, int korgus) {
        k = new Kilpkonn(0, 0);
        m = new char[laius][korgus];
        for (int y = 0; y < m[0].length; y++) {
            for (int x = 0; x < m.length; x++) {
                m[x][y]='.';
            }
        }
        m[k.kysiX()][k.kysiY()]=k.toString().charAt(0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < m[0].length; y++) {
            for (int x = 0; x < m.length; x++) {
                sb.append(m[x][y]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public Kilpkonn kysiKilpkonn() {
        return k;
    }

}
