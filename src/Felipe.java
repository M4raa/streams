import java.util.ArrayList;

public class Felipe {
    public static void main(String[] args) {
        ArrayList<Tareas> tareas = new ArrayList<>();
        tareas.add(new Tareas(1,6));
        tareas.add(new Tareas(2,4));
        tareas.add(new Tareas(3,5));

        tareas.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("---");

        tareas = new ArrayList<>();
        tareas.add(new Tareas(30,7));
        tareas.add(new Tareas(30,2));

        tareas.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
