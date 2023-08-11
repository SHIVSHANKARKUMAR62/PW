package PW_Program;

import java.util.Scanner;

public class Missing_Number_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int sum = 0;
        int number = n;
        int missing = number*(number+1)/2;
        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            sum = sum + arr[i];
        }

        int MN = missing - sum;
        System.out.println("Missing Number is: "+MN);

    }
}
