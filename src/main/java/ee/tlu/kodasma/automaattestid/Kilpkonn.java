package ee.tlu.kodasma.automaattestid;

public class Kilpkonn {
    int x;
    int y;
    int suund = 1;
    public Kilpkonn(int kx, int ky) {
        x = kx;
        y = ky;
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
        if (suund < 4) {
            suund++;
        } else {
            suund = 1;
        }
    }

    void edasi() {
        if (suund == 1) {
            x++;
        } if (suund == 2) {
            y++;
        } if (suund == 3) {
            x--;
        } if (suund == 4) {
            y--;
        }
    }
    
    @Override
    public String toString() {
        if (suund == 1) {
            return ">";
        } if (suund == 2) {
            return "v";
        } if (suund == 3) {
            return "<";
        } if (suund == 4) {
            return "^";
        }
        return "?";
    }
    
}
