package PW_Program.Assignment;
import java.util.Scanner;
public class Assignment02 {
    public static void main(String[] args) {
        int[][][] threeD;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array:- ");
        int n = sc.nextInt();
        threeD = new int[n][n][n];
        System.out.print("Enter Array Elements:- ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                for (int k=0;k<n;k++){
                    threeD[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Elements are ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                for (int k=0;k<n;k++){
                    System.out.print(threeD[i][j][k]+" ");
                }
            }
            System.out.println();
        }
        System.out.println(".......................");
        for (int[][] a : threeD){
            for (int[] b : a){
                for (int c : b){
                    System.out.print(c+" ");
                }
            }
            System.out.println();
        }
    }
}
