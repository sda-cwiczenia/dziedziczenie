import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Animal kot = new Animal("Filemon") {
            @Override
            public void getVoice() {
                System.out.println("miau miau");
            }
        };
        Animal pies = new Animal("Burek") {
            @Override
            public void getVoice() {
                System.out.println("hau hau");
            }
        };
        Kaczka kaczka = new Kaczka("DagDag");
        Animal sowa = new Sowa("Przemądrzała");

        List<Animal> animals = new ArrayList<>();
        animals.add(kot);
        animals.add(pies);
        animals.add(kaczka);
        //animals.add(sowa);

        for (Animal zwierzak : animals) {
            System.out.print("Jestem "+zwierzak.getNazwa()+" i robię ");
            zwierzak.getVoice();
            if (zwierzak instanceof Latajace) {
                ((Kaczka)zwierzak).latanie();
            }


        }

    }
}
