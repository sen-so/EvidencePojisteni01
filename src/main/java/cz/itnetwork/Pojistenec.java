package cz.itnetwork;

public class Pojistenec {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefonniCislo;

    private int id;
    private static int dalsiID = 1;


    public Pojistenec(String jmeno,String prijmeni,int vek,String telefonniCislo){
        this.jmeno=jmeno;
        this.prijmeni=prijmeni;
        this.vek=vek;
        this.telefonniCislo=telefonniCislo;
        id=dalsiID;
        dalsiID++;
    }

    public String getJmeno() {
        return jmeno;
    }


    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }


    public String getTelefonniCislo() {
        return telefonniCislo;
    }


    public int getId() {
        return id;
    }


    @Override
    public String toString(){
        return jmeno + "\t\t\t\t" +  prijmeni + "\t\t\t\t" + vek + "\t\t\t\t" + telefonniCislo ;
    }
}
