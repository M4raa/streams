import java.util.ArrayList;

public class Loteria {
    public static void main(String[] args) {
        ArrayList<LoteriaJusta> loteria = new ArrayList<>();
        loteria.add(new LoteriaJusta(9,4));
        loteria.add(new LoteriaJusta(10,6));
        loteria.add(new LoteriaJusta(9,5));
        loteria.add(new LoteriaJusta(1,3));

        loteria.stream()
                .filter()
                .forEach(System.out::println);
    }
}
