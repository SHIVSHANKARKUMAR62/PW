package PW_Program.Array;

import java.util.Scanner;

public class Pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();

//        for (int j=0;j<n;j++){
//            System.out.print(" ");
//            for (int k=0;k<(n-1);k++) {
//                System.out.print("*");
//            }
//                for (int s=0;s<=j;s++){
//                    System.out.print(" ");
//                }
//            System.out.println();
//        }

//
        int p = 0;
        for (int i = 1;i<=n;i++){
            for (int j = n;j>=i;j--) {
                System.out.print(" ");
                p=j;
            }
            for (int k =  2;k<=i;k++){
                System.out.print(p);
                p--;
            }
            System.out.println();
        }
    }
}
