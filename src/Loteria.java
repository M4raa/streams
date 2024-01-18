import java.util.ArrayList;

public class Loteria {
    public static void main(String[] args) {
        ArrayList<LoteriaJusta> loteria = new ArrayList<>();
        loteria.add(new LoteriaJusta(9,4));
        loteria.add(new LoteriaJusta(10,6));
        loteria.add(new LoteriaJusta(9,5));
        loteria.add(new LoteriaJusta(1,3));

        System.out.println(justa(loteria));

        loteria = new ArrayList<>();
        loteria.add(new LoteriaJusta(10,5));
        loteria.add(new LoteriaJusta(20,5));
        loteria.add(new LoteriaJusta(30,5));

        System.out.println(justa(loteria));

    }

    public static String justa(ArrayList<LoteriaJusta> loteria2){
        for (int i = 0; i < loteria2.size()-1; i++) {
            if (loteria2.get(i).getDinero() > loteria2.get(i+1).getDinero()){
               if (!(loteria2.get(i).getPremios() > loteria2.get(i+1).getPremios())) {
               return "NO";
               }
            } else if (loteria2.get(i).getDinero() < loteria2.get(i+1).getDinero()) {
                if (!(loteria2.get(i).getPremios() < loteria2.get(i + 1).getPremios())) {
                    return "NO";
                }
            } else if (loteria2.get(i).getDinero() == loteria2.get(i+1).getDinero()) {
                if (!(loteria2.get(i).getPremios() == loteria2.get(i + 1).getPremios())) {
                    return "NO";
                }
            }
        }
        return "SI";
    }
}
