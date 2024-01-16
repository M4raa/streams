public class Tareas implements java.lang.Comparable<Tareas>{

    private int prioridad;
    private int tiempo;

    public Tareas(int prioridad, int tiempo){
        this.prioridad=prioridad;
        this.tiempo=tiempo;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public int getTiempo(){
        return tiempo;
    }

    @Override
    public String toString() {
        return String.valueOf(this.prioridad) + " " + String.valueOf(this.tiempo);
    }
    @Override
    public int compareTo(Tareas other){
        if (this.prioridad == other.getPrioridad()){
            if (this.getTiempo()<other.getTiempo()){
                return -1;
            }else return 1;
        } else if (this.prioridad > other.getPrioridad()) {
            return -1;
        }else return 1;
    }

}
