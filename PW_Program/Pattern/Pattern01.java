package PW_Program.Pattern;

import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        char c = 65;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
