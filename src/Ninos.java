public class Ninos implements Comparable<Ninos>{
    private int bueno;
    private int peso;

    public Ninos(int bueno, int peso){
        this.bueno = bueno;
        this.peso = peso;
    }
    public int getBueno() {
        return bueno;
    }
    public int getPeso(){
        return peso;
    }

    @Override
    public String toString() {
        return String.valueOf(this.bueno) + " " + String.valueOf(this.peso);
    }
    @Override
    public int compareTo(Ninos other){
        if (this.bueno == other.bueno){
            return this.peso - other.peso;
        } else {
            return other.bueno - this.bueno;
        }
    }
}
