import java.util.ArrayList;

public class Nino {
    public static void main(String[] args) {
        ArrayList<Ninos> ninos = new ArrayList<>();
        ninos.add(new Ninos(80,2));
        ninos.add(new Ninos(100,12));
        ninos.add(new Ninos(100,1));

        ninos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
