import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String cadena = sc.nextLine();
            if (cadena.isBlank()){
                break;
            }else cadenas.add(cadena);
        }
        cadenas.forEach(System.out::println);
    }
}
