public class Objetos implements Comparable<Objetos>{

    private String nombre;
    private int valor;
    private int peso;

    public Objetos(String nombre, int valor, int peso){
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }
    public int getValor() {
        return valor;
    }
    public int getPeso(){
        return peso;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    @Override
    public int compareTo(Objetos other){
        if (this.valor == other.valor){
            return this.peso - other.peso;
        } else {
            return other.valor - this.valor;
        }
    }
}