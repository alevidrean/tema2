package ex3;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Sir de baza:");
        StringBuilder sir=new StringBuilder(scanner.nextLine());
        System.out.println("sir introdus:");
        StringBuilder sir_introdus=new StringBuilder(scanner.nextLine());
        System.out.println("pozitia");
        int pozitia=scanner.nextInt();
        sir.insert(pozitia,sir_introdus);
        System.out.println(sir.toString());

        System.out.println("Pozitia pt stergere;");
        int pozitie_stergere=scanner.nextInt();
        System.out.println("Nr caractere");
        int nrcarat=scanner.nextInt();
        int pozfinal=pozitie_stergere+nrcarat;
        sir.delete(pozitie_stergere,pozfinal);
        System.out.println(sir.toString());
        scanner.close();


    }
}
