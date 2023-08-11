package PW_Program.Array.String;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String value:- ");
        String n = sc.next();
        System.out.println(n.substring(1));
        System.out.println(n.substring(-1));
    }
}
