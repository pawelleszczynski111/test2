import Zad1.Kandydat;
import Zad1.Rekrutacja;

import java.util.ArrayList;

public class Main {











    public static void main(String[] args) {

        ArrayList<Kandydat> grupa = new ArrayList<Kandydat>();
        Kandydat kandydat1 = new Kandydat("Jan", 25, "licencjat", 2);
        Kandydat kandydat2 = new Kandydat("Paulina", 43, "magister", 9);
        Kandydat kandydat3 = new Kandydat("Jarosław", 55, "magister", 20);
        Kandydat kandydat4 = new Kandydat("Piotr", 36, "licencjat", 10);
        Kandydat kandydat5 = new Kandydat("Alicja", 42, "magister", 9);

        grupa.add(kandydat1);
        grupa.add(kandydat2);
        grupa.add(kandydat3);
        grupa.add(kandydat4);
        grupa.add(kandydat5);

        grupa.sort(Kandydat::compareTo);

        for(int i = 0; i <=grupa.size()-1
                ; i++){
            System.out.println(grupa.get(i).getNazwa());

        }

        System.out.println(Qualified(kandydat1));

    }

    public static boolean Qualified(Kandydat k){
        Rekrutacja.set();
        if (k.getLataDoswiadczenia() >= Rekrutacja.getDoswiadczenie())
            return true;

        return false;
    }
}