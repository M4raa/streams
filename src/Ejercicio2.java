import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "Armenio", 1968);
        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);
        personas.add(persona);

        long cuantas = personas.stream()
                .filter(person -> "aAáÁàÀ".indexOf(person.getApellido().charAt(0)) > 0)
                .count();
        System.out.printf("Hay %d personas que su apellido empieze por A", cuantas);
    }
}
