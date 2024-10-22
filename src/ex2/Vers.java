package ex2;
import java.util.Random;
public class Vers {
    private String versuri;

    public void setvers(String versuri)
    {
        this.versuri=versuri;
    }
     public int nrcuv() {
         return versuri.split(" ").length;
     }
     public int nrvoc()
     {
         int voc=0;
         String vocale="aeiouAEIOU";
         for(int i=0;i<versuri.length();i++)
         {
             char caracter=versuri.charAt(i);
             if(vocale.indexOf(caracter)>=0)
             voc++;
         }
         return voc;
     }
     double randomval()
     {
         Random random=new Random();
         return random.nextDouble();
     }
    public String randomUpperCase(double randomVal) {
        if (randomVal< 0.1) {
            return versuri.toUpperCase();
        } else {
            return versuri;
        }
    }
    public boolean grupare(String gruparealeasa)
    {
       return versuri.endsWith(gruparealeasa);
    }
}
