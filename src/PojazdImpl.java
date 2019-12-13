public abstract class PojazdImpl extends Pojazd {
    public PojazdImpl(double waga) {
        super(waga);
    }

    @Override
    public void start() {
        System.out.println("Pojazd jedzie z klasy PojazdImpl");
    }

    @Override
    public void stop() {
        System.out.println("Pojazd stoi z klasy PojazdImpl");

    }

    public void nowaMetoda() {
        System.out.println("Ha ha, ja jestem tylkow PojazdImpl");
    }
    public abstract void nowaMetoda2();
}
