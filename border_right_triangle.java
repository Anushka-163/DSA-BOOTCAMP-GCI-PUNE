# DSA-BOOTCAMP-GCI-PUNE
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sp=0,st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==j) System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
