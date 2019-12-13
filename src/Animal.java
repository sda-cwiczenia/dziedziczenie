public abstract class Animal {
    String nazwa;

    public Animal(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public abstract void getVoice();
}
