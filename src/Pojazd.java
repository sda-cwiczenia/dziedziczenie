abstract class Pojazd {
    protected final double waga;
    protected double przebieg;

    public Pojazd(double waga) {this.waga = waga;}

    public abstract void start(); //tylko sygnatura bez definicji

    public abstract void stop();  //tylko sygnatura bez definicji


    public double getPrzebieg() {return przebieg;}

    public double getWaga() {return waga;}
}

