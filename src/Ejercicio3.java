import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "Armenio", 1968);
        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);
        personas.add(persona);

        personas.stream()
                .map(Person::getNombre)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
