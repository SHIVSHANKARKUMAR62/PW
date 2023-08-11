package PW_Program.Array;

import java.util.Scanner;

public class pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        int p = 0;
        for (int i = 1;i<=n;i++){
            for (int x = n;x>=i;x--) {
                System.out.print(" ");
                p=x;
            }
            for (int k =  2;k<=i;k++){
                System.out.print(p);
                p--;
            }
            for (int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for (int j=1;j<=n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
