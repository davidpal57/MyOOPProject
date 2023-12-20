import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyArrayList {
    //static ArrayList<String> cursuri = new ArrayList<>();
    public static void afiseazaListaCursuri(ArrayList<String> oriceLista){
        System.out.println("Elementele listei sunt: ");
        for (String c: oriceLista){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> listaNoastra = new ArrayList<>();
        listaNoastra.add("First");
        listaNoastra.add("Second");
        listaNoastra.add("Third");
        listaNoastra.set(0,"First-replaced");
        listaNoastra.remove(2);

        for (String element : listaNoastra) {
            System.out.println(element);
        }
        System.out.println(listaNoastra.size());
        System.out.println(listaNoastra.contains("Second"));
        System.out.println(listaNoastra.add("Second"));

        //Ex 1 structuri de date

        ArrayList<String> listaCursuri = new ArrayList<>();
        listaCursuri.add("Testare manuala");
        listaCursuri.add("Testare automata");
        listaCursuri.add("Front-end");
        listaCursuri.add("Java");
        System.out.println(listaCursuri.get(1));
        System.out.println(listaCursuri.size());
        afiseazaListaCursuri(listaCursuri);

        ArrayList<String> filme = new ArrayList<>();
        filme.add("Harry Potter");
        filme.add("Home alone");

        afiseazaListaCursuri(filme);
    }
}
