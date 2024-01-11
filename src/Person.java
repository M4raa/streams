public class Person {
    private String nombre;
    private String apellido;
    private int aNac;
    public Person(String nombre, String apellido, int aNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.aNac = aNac;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getaNac() {
        return this.aNac;
    }
    }