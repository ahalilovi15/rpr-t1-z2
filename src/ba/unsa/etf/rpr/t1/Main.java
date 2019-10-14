package ba.unsa.etf.rpr.t1;
import java.util.Scanner;
public class Main {
    public static int sumaCifara(int x) {
        int suma=0;
        while(x!=0){
            suma=suma+x%10;
            x=x/10;
        }
        return suma;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner ulaz=new Scanner(System.in);
        int n;
        System.out.println("Unesi n: ");
        n=ulaz.nextInt();
        for(int i=1;i<=n;i++) {
            if (sumaCifara(i) % i == 0)
            {   System.out.println(i); }
        }

    }
}
