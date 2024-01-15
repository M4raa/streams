import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Illiterate {
    public static void main(String[] args) throws IOException {
        String line;
        String datos="";
        BufferedReader reader = new BufferedReader(new FileReader("/home/INFORMATICA/alu10663409/Escritorio/IntJ/Streams/Files/illiterate.csv"));
        reader.readLine();
        while ((line = reader.readLine())!=null) {
            datos+=line;
        }
        reader.close();
        List<Poblacion> Poblacion = new ArrayList<>();
        String[] dato1 = datos.split(",,");
        for (String dato2:dato1) {
            String[] dato3 = dato2.split(",");
            Poblacion dato = new Poblacion(dato3[5],Integer.parseInt(dato3[8]));
            Poblacion.add(dato);
        }
        Poblacion.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
