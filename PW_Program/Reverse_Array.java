package PW_Program;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //1dst way
        System.out.print("1st way to reverse the number: ");
        for (int i=n; i>0; i--){
            System.out.print(arr[i-1]+" ");
        }

        // 2nd way

        for (int i = 0;i< arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        System.out.print("2nd way to reverse the number: ");

        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
