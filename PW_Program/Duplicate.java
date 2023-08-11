package PW_Program;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Duplicate Elements are: ");

        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
