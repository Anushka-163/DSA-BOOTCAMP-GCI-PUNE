# DSA-BOOTCAMP-GCI-PUNE
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int sp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++) System.out.print("\t");
            for(int k=1;k<=i;k++) System.out.print("*\t");
            System.out.println();
            
        }

    }
}
