package cz.itnetwork;

import java.util.ArrayList;
import java.util.Collections;

public class Databaze implements Comparable {

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
    public ArrayList<Pojistenec> najdiPojistence(String jmeno, String prijmeni) {
        ArrayList<Pojistenec> nalezene = new ArrayList<>();
        for (Pojistenec pojistenec : pojistenci) {
            if (((pojistenec.getJmeno().toLowerCase()).equals(jmeno.toLowerCase())) && (pojistenec.getPrijmeni().toLowerCase().equals(prijmeni.toLowerCase()))) {
                nalezene.add(pojistenec);
            }
        }
        return nalezene;
    }

    public int velikostDatabaze(){
        int velikost = pojistenci.size();
        return velikost;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
