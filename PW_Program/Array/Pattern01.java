package PW_Program.Array;

import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        int p = n;
        for (int i=0;i<n;i++){
            for(int j=i;j<n;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=2*i;j++) {
                if (j==i){
                    System.out.print("1");
                }else {
                    System.out.print(p);
                    p--;
                }
            }
                System.out.println();
            }
        }
    }
