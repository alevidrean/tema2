package ex4;

import java.time.LocalDate;
import java.time.Period;

public class Persoana {
    private String cnp;
    private String nume;

    public Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }


    public String getNume() {
        return nume;
    }


    public String getCnp() {
        return cnp;
    }


    public int getVarsta() {
        if (!esteValidCNP(cnp)) {
            return -1;
        }

        int anNastere;
        int lunaNastere = Integer.parseInt(cnp.substring(3, 5));
        int ziNastere = Integer.parseInt(cnp.substring(5, 7));


        char primaCifra = cnp.charAt(0);
        if (primaCifra == '1' || primaCifra == '2') {
            anNastere = 1900 + Integer.parseInt(cnp.substring(1, 3));
        } else if (primaCifra == '5' || primaCifra == '6') {
            anNastere = 2000 + Integer.parseInt(cnp.substring(1, 3));
        } else {
            return -1;
        }


        LocalDate dataNasterii = LocalDate.of(anNastere, lunaNastere, ziNastere);
        LocalDate dataCurenta = LocalDate.now();
        Period varsta = Period.between(dataNasterii, dataCurenta);

        return varsta.getYears();
    }

    public static boolean esteValidCNP(String cnp) {

        if (cnp.length() != 13) {
            return false;
        }
        if (!cnp.matches("\\d+")) {
            return false;
        }
        char primaCifra = cnp.charAt(0);
        if (primaCifra != '1' && primaCifra != '2' && primaCifra != '5' && primaCifra != '6') {
            return false;
        }
        String control = "279146358279";
        int s = 0;

        for (int i = 0; i < 12; i++) {
            s += (cnp.charAt(i) - '0') * (control.charAt(i) - '0');
        }

        int cifracontrl = s % 11;
        if (cifracontrl == 10) {
            cifracontrl = 1;
        }

        int ultimacifra = cnp.charAt(12) - '0';
        return cifracontrl == ultimacifra;

    }

}
