public class Kaczka extends Animal implements Latajace {
    public Kaczka(String nazwa) {
        super(nazwa);
    }

    @Override
    public void getVoice() {
        System.out.println("kwa kwa");
    }

    @Override
    public void latanie() {
        System.out.println("A ja umiem latać");
    }

//    public void latanie() {
//        System.out.println("A ja umiem latać");
//    }
}
