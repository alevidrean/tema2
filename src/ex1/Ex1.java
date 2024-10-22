package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] judete=new String[41];
        Scanner scanner=new Scanner(new File("src/ex1/in.txt"));
 int k=0;
 while(scanner.hasNext())
 {
     judete[k++]=scanner.next();
 }

     scanner.close();

        Arrays.sort(judete,0,k);
 for(int j=0;j<k;j++)
     System.out.println(judete[j]);
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Introduceti jud cautat:");
        String judet_Cautat;
        judet_Cautat=scanner1.next();
        scanner1.close();

        int i=Arrays.binarySearch(judete,0,k,judet_Cautat);
        if(i>=0) {
            System.out.println("Judetul " + judet_Cautat + " se afla pe pozitia:" + i);

        }
        else System.out.println("Judetul nu a fost gasit");
    }
}
