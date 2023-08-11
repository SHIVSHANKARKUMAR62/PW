package PW_Program;

import java.util.Scanner;

public class paidrNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int s = 0;
        System.out.print("Enter Array Elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n/2; i++){
            if (arr[i] == arr[n-i-1]){
                s = 1;
                break;
            }
        }
        if (s==1){
            System.out.println("P");
        }else {
            System.out.println("NP");
        }
    }
}
