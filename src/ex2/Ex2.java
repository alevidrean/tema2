package ex2;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        Vers[] vers = new Vers[10];
        int nr = 0;
        Scanner scanner = new Scanner(new File("src/ex2/cantec.txt"));
        PrintStream out = new PrintStream(new File("src/ex2/cantec_out.txt"));
        String gruparealeasa="da";
        while (scanner.hasNextLine()) {
            vers[nr] = new Vers();
            vers[nr].setvers(scanner.nextLine());
            double randomVal = vers[nr].randomval();
            String versFormatat = vers[nr].randomUpperCase(randomVal);
if(vers[nr].grupare(gruparealeasa))
{
    versFormatat += " *";
}


            out.println(versFormatat + " " + vers[nr].nrcuv() + " " + vers[nr].nrvoc() + " " + String.format("%2f",randomVal));
            nr++;
        }
        out.close();
        scanner.close();
    }
}
