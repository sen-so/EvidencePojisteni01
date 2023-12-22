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

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public String getTelefonniCislo() {
        return telefonniCislo;
    }

    public void setTelefonniCislo(String telefonniCislo) {
        this.telefonniCislo = telefonniCislo;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString(){
        return jmeno + "\t" +  prijmeni + "\t" + vek + "\t" + telefonniCislo + "\n";
    }
}
