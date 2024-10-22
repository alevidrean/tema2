package ex4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de persoane: ");
        int n = scanner.nextInt();

        Persoana[] persoane = new Persoana[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduceti numele persoanei: ");
            String nume = scanner.next();

            String cnp;
            while (true) {
                System.out.print("Introduceti CNP-ul persoanei: ");
                cnp = scanner.next();
                if (Persoana.esteValidCNP(cnp)) {
                    break;
                } else {
                    System.out.println("CNP invalid! Reintroduceti!.");
                }
            }


            persoane[i] = new Persoana(nume, cnp);
        }


        for (Persoana persoana : persoane) {
            int varsta = persoana.getVarsta();
            if (varsta != -1) {
                System.out.println("Nume: " + persoana.getNume() + ", CNP: " + persoana.getCnp() + ", Varsta: " + varsta);
            } else {
                System.out.println("Nume: " + persoana.getNume() + ", CNP: " + persoana.getCnp() + " - CNP invalid pentru calculul varstei.");
            }
        }

        scanner.close();

    }
}
