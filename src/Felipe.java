public class Felipe  implements java.lang.Comparable<Felipe>{
    private int tareas;
    private int tarea;
    private int tiempo;

    public Felipe(int tareas, int tarea, int tiempo){
        this.tareas=tareas;
        this.tarea=tarea;
        this.tiempo=tiempo;
    }
    public int getTareas() {
        return tareas;
    }public int getTarea() {
        return tarea;
    }
    public int getTiempo(){
        return tiempo;
    }

    @Override
    public String toString() {
        return String.valueOf(this.tarea) + String.valueOf(this.tiempo);
    }

}
