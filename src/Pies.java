public class Pies extends Animal {
    public Pies(String nazwa) {
        super(nazwa);
    }

    @Override
    public void getVoice() {
        System.out.println("hau hau");
    }
}
