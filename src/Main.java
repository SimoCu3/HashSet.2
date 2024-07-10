/*
CONSEGNA:
Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato
*/

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

    //Copio la lista
    HashSet<String> silverware1 = setSilverware();

    //Nuovo oggetto
    String newSilverware = "Spoon";

    //Aggiungo oggetto alla lista
    silverware1.add(newSilverware);

    //Stampo lista
    for(String readSilverware : silverware1){
            System.out.println(readSilverware);
    }

    //Verifica presenza dell'oggetto nella lista
    boolean findSilverware = silverware1.contains(newSilverware);

    if (findSilverware) {
            System.out.println("L'elemento \"" + newSilverware + "\" è presente nel set.");
        } else {
            System.out.println("L'elemento \"" + newSilverware + "\" non è presente nel set.");
        }

    }


    public static HashSet<String> setSilverware(){

        HashSet<String> silverware = new HashSet<>();

        silverware.add("Fork");
        silverware.add("Knife");
        //silverware.add("Spoon");

        return silverware;
    }
}

/*
CORREZIONE:

*/