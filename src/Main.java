public class Main {
    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd(1800) {
            @Override
            public void start() {
                System.out.println("Pojazd jedzie");
            }

            @Override
            public void stop() {
                System.out.println("Pojazd stoi");

            }
        };  // tutaj kończy się definicja zmiennej pojazd

        Pojazd pojazd1 = new PojazdImpl(2200) {
            @Override
            public void nowaMetoda2() {
                System.out.println("nowa metoda mojaMetoda2");
            }
        };
        if (pojazd1 instanceof PojazdImpl) {
            System.out.println("pojzd jest instancją PojazdImpl");
            ((PojazdImpl) pojazd1).nowaMetoda();
        }

        pojazd.stop();
        pojazd.start();
        pojazd1.stop();
        pojazd1.start();

    }
}
