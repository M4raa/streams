public class Poblacion implements java.lang.Comparable<Poblacion>{
    private String pais;
    private int analfabetos;

    public Poblacion(String pais, int analfabetos){
        this.pais = pais;
        this.analfabetos = analfabetos;
    }
    public String getPais() {
        return this.pais;
    }public int getAnalfabetos() {
        return this.analfabetos;
    }
    @Override
    public String toString() {
        return this.getPais() + " -> " + this.getAnalfabetos();
    }
    @Override
    public int compareTo(Poblacion other) {
        if (this.analfabetos == other.getAnalfabetos()) {
            return 0;
        } else if (this.analfabetos> other.getAnalfabetos()) {
            return 1;
        } else {
            return -1;
        }
    }
}
