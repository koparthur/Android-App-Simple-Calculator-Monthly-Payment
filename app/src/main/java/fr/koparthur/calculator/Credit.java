package fr.koparthur.calculator;

public class Credit {

    private double c, t, m;
    private double n;

    public Credit(double c, double n , double t) {
        this.c = c;
        this.t = t;
        this.n = n;
        m = (c*t/12)/(1-Math.pow((1 + t / 12),-n));
    }
    public double getM(){
        return m;
    }
}
