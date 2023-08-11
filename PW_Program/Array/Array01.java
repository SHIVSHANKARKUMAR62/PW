package PW_Program.Array;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.print("Enter the size of an array:- ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter Array Elements:- ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            arr.clone();
        }
        System.out.print("Array Elements are:- ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
