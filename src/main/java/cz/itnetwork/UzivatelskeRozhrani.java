package cz.itnetwork;

import java.util.Scanner;

public class UzivatelskeRozhrani {


    /*
    Scanner sc = new Scanner(System.in);


    public String zadejJmenoAprijmeni(String udaj) {

        String jmeno = "";
        boolean kontrolaUdaje = false;
        boolean spravneZnakyVretezci = true; //může se později změnit na FALSE a vypsat chybu s nechtěnými znaky

        System.out.print("Zadejte " + udaj + " pojisteného(bez diakritiky):");
        do {
            jmeno = sc.nextLine();
            if (jmeno.length() > 2) { //jestli má jméno/příjmení alespon 2 znaky, proběhne kontrola, zda v textu nejsou čísla nebo jiné znaky.
                spravneZnakyVretezci = VedeniPojistenych.kontrolaZnakuVretezci(jmeno, false);
                if (spravneZnakyVretezci == true) {
                    kontrolaUdaje = true;
                    return jmeno;
                }
            } else kontrolaUdaje = false;

            if (kontrolaUdaje == false) {
                System.out.print("Špatně zadané " + udaj + ". Musí obsahovat alespoň 3 znaky.");
                if (!spravneZnakyVretezci) {
                    System.out.print(udaj + " nesmí obsahovat diakritiku, speciální znaky ani číslice.");
                    spravneZnakyVretezci = true;
                }
                System.out.print("\nZadejte prosím " + udaj + " znovu:");
            }
        } while (!kontrolaUdaje);
        return jmeno;
    }

    public String zadejTelefonniCislo() {
        String telefonniCislo = "";
        String telefonniCisloBezMezer = "";
        boolean kontrolaUdaje = false;
        boolean spravneZnakyVretezci = true;
        System.out.print("Zadej telefonní číslo:");
        do {
            telefonniCislo = sc.nextLine();
            for (char znak : telefonniCislo.toCharArray()) {
                if (znak != ' ')
                    telefonniCisloBezMezer += znak;
            }

            if (telefonniCisloBezMezer.length() == 9) {
                spravneZnakyVretezci = VedeniPojistenych.kontrolaZnakuVretezci(telefonniCisloBezMezer, true);
                if (spravneZnakyVretezci == true) {
                    kontrolaUdaje = true;
                    return telefonniCislo;
                }
            } else kontrolaUdaje = false;

            if (kontrolaUdaje == false) {
                System.out.print("Telefonní číslo musí obsahovat 9 číslic.");
                if (!spravneZnakyVretezci)
                    System.out.print("Musí obsahovat pouze číslice, žádné jiné znaky.");
                System.out.print("\nZadejte prosím telefonní číslo znovu:");
                telefonniCisloBezMezer = "";
            }
        } while (!kontrolaUdaje);
        return telefonniCislo;
    }

    public int zadejVek() {
        int vek = 0;
        System.out.print("Zadejte věk:");
        do {
            try {
                vek = Integer.parseInt(sc.nextLine());
            } catch (Exception E) {
                System.out.println("Věk musí být pouze celé číslo.");
            }
            if (!(vek > 0 && vek < 150))

                System.out.print("Špatně zadaný věk. Zadej prosím celou, kladnou číslovkou znovu:");


        } while (!(vek > 0 && vek < 150));
        return (int) vek;
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


    */
}