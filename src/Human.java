public class Human implements java.lang.Comparable<Human> {
    private String name;
    private double salario;

    public Human(String name, double salario){
        this.name = name;
        this.salario = salario;
    }


    public String getName() {
        return this.name;
    }

    public double getSalario() {
        return this.salario;
    }
    @Override
    public int compareTo(Human other) {
        if (this.salario == other.getSalario()) {
            return 0;
        } else if (this.salario> other.getSalario()) {
            return 1;
        } else {
            return -1;
        }
    }
}
