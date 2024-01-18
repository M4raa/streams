public class LoteriaJusta implements Comparable<LoteriaJusta>{

    private int dinero;
    private int premios;

    public LoteriaJusta(int dinero, int premios){
        this.dinero =dinero;
        this.premios =premios;
    }
    public int getDinero() {
        return dinero;
    }
    public int getPremios(){
        return premios;
    }

    @Override
    public String toString() {
        return String.valueOf(this.dinero) + " " + String.valueOf(this.premios);
    }
    @Override
    public int compareTo(LoteriaJusta other){
        if (this.dinero == other.dinero){
            return this.premios - other.premios;
        } else {
            return this.dinero - other.dinero;
        }
    }
}

