import java.util.ArrayList;

// Silas
public class Room extends Thing{

    private ArrayList<Thing> items = new ArrayList<>();;
    private int n, s, e, w;

    public Room(String Name, String Description, int N, int S, int E, int W) {
        super(Name, Description);
        this.n = N;
        this.s = S;
        this.e = E;
        this.w = W;
    }

    public void addItem(Thing item) {
        items.add(item);
    }

    public void removeItem(Thing item) {
        items.remove(item);
    }

    public ArrayList<Thing> getItems() {
        return new ArrayList<>(items);
    }


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

}
