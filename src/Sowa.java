public class Sowa extends Animal implements Latajace {
    public Sowa(String nazwa) {
        super(nazwa);
    }

    @Override
    public void getVoice() {
        System.out.println("huu huu");
    }

    @Override
    public void latanie() {
        System.out.println("Ja latam tylko w nocy");
    }
}
