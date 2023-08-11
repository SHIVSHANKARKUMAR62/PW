package PW_Program.Assignment;

import java.util.Scanner;
public class Assignment01 {
    public static void main(String[] args) {
        int[][] twoD;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array:- ");
        int n = sc.nextInt();
        twoD = new int[n][n];
        System.out.print("Enter Array Elements:- ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                twoD[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements are");

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(".......................");

        for (int[] i : twoD){
            for (int b : i){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
