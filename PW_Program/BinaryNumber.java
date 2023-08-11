package PW_Program;


import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int a = Integer.parseInt(Integer.toBinaryString(n));
        System.out.println("Binary of "+n +" is "+a);
    }
}
