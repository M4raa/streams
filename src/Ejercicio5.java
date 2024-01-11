import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> cadenas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int cadena = sc.nextInt();
            if (cadena<0){
                break;
            }else cadenas.add(cadena);
        }
        cadenas.stream()
                .filter(x -> x>=1 && x<=5)
                .forEach(System.out::println);
    }
}