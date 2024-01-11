import java.util.ArrayList;

public class SumaPositivosNegativos {
    public static void main(String[] args) {
        ArrayList<Integer> convStream = new ArrayList<>();
        convStream.add(1);
        convStream.add(-1);
        convStream.add(2);
        convStream.add(-2);
        convStream.add(3);
        convStream.add(-3);
        convStream.add(4);
        //Positivos
        Long suma1 = convStream.stream()
                .mapToInt(Integer::valueOf)
                .filter(x -> x>0)
                .count();
        //Negativos
        Long suma2 = convStream.stream()
                .mapToInt(Integer::valueOf)
                .filter(x -> x<0)
                .count();
        System.out.printf("Hay %d positivos",suma1);
        System.out.printf("Hay %d negativos",suma2);

    }
}
