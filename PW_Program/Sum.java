package PW_Program;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number:- ");
        a = sc.nextInt();

        System.out.print("Enter 2nd number:- ");
        b = sc.nextInt();

        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));

    }
}
