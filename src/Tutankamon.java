import java.util.ArrayList;
import java.util.List;

public class Tutankamon {
    public static void main(String[] args) {
        ArrayList<Objetos> objetos = new ArrayList<>();
        objetos.add( new Objetos("flecha",5,1));
        objetos.add( new Objetos("sandalias",10,2));
        objetos.add( new Objetos("sarcofago",1000,1000));
        objetos.add( new Objetos("mascara",1000,10));
        objetos.add( new Objetos("arco",10,2));

        objetos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
