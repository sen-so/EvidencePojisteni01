package cz.itnetwork;

import java.util.Scanner;

public class VedeniPojistenych {

    private Databaze databaze;
    Scanner sc = new Scanner(System.in);

//Pojistenec(String jmeno,String prijmeni,int vek,String telefonniCislo){


    public void vytvorPojistence() {
        String jmeno;
        String prijmeni;
        String telefonniCislo;
        int vek;

        jmeno = zadejJmenoAprijmeni("jméno");
        prijmeni = zadejJmenoAprijmeni("příjmení");


    }

    public boolean kontrolaVstupu(String slovo, boolean vek) {
        if (!vek) {
            if (slovo.length() > 2) {
                return true;
            } else return false;
        } else {
            int pocetRoku = Integer.parseInt(slovo);
            if (pocetRoku > 18) return true;
            else return false;
        }
    }

    public boolean kontrolaZnakuVretezci(String udaj, boolean jeToCislo) {
        boolean spravneZadanyUdaj = false;
        if (jeToCislo) {
            for (char znak : udaj.toCharArray()) {
                int znakVascii = (int) znak;
                if (znakVascii >= 48 && znakVascii <= 57) {
                    spravneZadanyUdaj = true;
                } else {
                    spravneZadanyUdaj = false;
                    break;
                }

            }
        } else
            udaj = udaj.toUpperCase();
        for (char znak : udaj.toCharArray()) {
            int znakVascii = (int) znak;
            if (znakVascii >= 65 && znakVascii <= 90) {
                spravneZadanyUdaj = true;
            } else {
                spravneZadanyUdaj = false;
                break;
            }
        }
        return spravneZadanyUdaj;

    }

    public String zadejJmenoAprijmeni(String udaj) {

        String jmeno = "";
        boolean kontrolaUdaje = true;
        boolean spravneZnakyVretezci = true;

        System.out.println("Zadejte " + udaj + " pojisteného(bez diakritiky):");
        do {

            jmeno = sc.nextLine();
            if (jmeno.length() > 2) { //jestli má jméno/příjmení alespon 2 znaky, proběhne kontrola, zda v textu nejsou čísla nebo jiné znaky.
                spravneZnakyVretezci = kontrolaZnakuVretezci(jmeno, false);
                if (spravneZnakyVretezci == false) kontrolaUdaje = false;
                return jmeno;
            } else kontrolaUdaje = false;

            
            if (kontrolaUdaje == false) {
                System.out.println("Špatně zadané " + udaj + ". Musí obsahovat alespoň 3 znaky.");
                if (!spravneZnakyVretezci)
                    System.out.print(udaj + " nesmí obsahovat diakritiku, speciální znaky ani číslice.\n");
                System.out.print("Zadejte prosím " + udaj + " znovu:");
            }
        } while (!kontrolaUdaje);
        return jmeno;
    }

    public String zadejTelefonniCislo(String udaj) {
        String telefonniCislo = "";
        boolean spravneZnakyVretezci = true;
        boolean kontrolaUdaje = true;
        System.out.println("Zadej telefonní číslo:");
        do {
            if (kontrolaUdaje == false) {
                System.out.println("Telefonní číslo musí obsahovat pouze 9 číslic.");
                if (!spravneZnakyVretezci) System.out.print("Musí obsahovat pouze číslice, žádné jiné znaky.\n");
                System.out.println("Zadejte prosím telefonní číslo znovu:");
            }
            telefonniCislo = sc.next();
            telefonniCislo = telefonniCislo.trim();

            if (telefonniCislo.length() == 9) {
                spravneZnakyVretezci = kontrolaZnakuVretezci(telefonniCislo, true);
                if (spravneZnakyVretezci ==false) kontrolaUdaje = false;
                return telefonniCislo;
            } else kontrolaUdaje = false;
        } while (!kontrolaUdaje);
        return telefonniCislo;
    }


    public void vypisMenuEvidence() {
        System.out.println("---------------------------");
        System.out.println("Evidence pojistenych");
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("Vyberte si akci:");
        System.out.println("1 – Pridat nového pojisteného ");
        System.out.println("2 – Vypsat vsechny pojistené");
        System.out.println("3 - Vyhledat pojisteneho");
        System.out.println("4 – Konec");
    }


}
