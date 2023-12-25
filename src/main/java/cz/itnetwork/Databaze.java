package cz.itnetwork;

import java.util.ArrayList;

public class Databaze {

    private ArrayList<Pojistenec> pojistenci;

    public Databaze() {
        pojistenci = new ArrayList<>();
    }

    public void pridejPojistence(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, telefonniCislo));
    }

    public ArrayList<Pojistenec> najdiPojistence() {
        ArrayList<Pojistenec> nalezene = new ArrayList<>();
        for (Pojistenec pojistenec : pojistenci) {
            nalezene.add(pojistenec);
        }
    return nalezene;
    }

    public int velikostDatabaze(){
        int velikost = pojistenci.size();
        return velikost;
    }

}
