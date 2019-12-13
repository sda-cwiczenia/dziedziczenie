public class Kot extends Animal {
    public Kot(String nazwa) {
        super(nazwa);
    }

    @Override
    public void getVoice() {
        System.out.println("miau miau");
    }
}
