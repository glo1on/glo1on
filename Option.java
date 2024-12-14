
public class Option {

    String pair1;
    String pair2;
    String pair3;
//Overloaded constructor: one takes 2 parameters, the other takes 3

    Option(String pair1, String pair2) {
        this.pair1=pair1;
        this.pair2=pair2;

    }

    Option(String pair1, String pair2, String pair3) {
        this.pair1=pair1;
        this.pair2=pair2;
        this.pair3=pair3;
    }

}
