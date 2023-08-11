package PW_Program.Recursion;

import java.util.Scanner;

class Calculation{
    int result;
    public int Fact(int n){
        if (n==0 || n==1){
            return 1;
        }else{
            result = n * Fact(n-1);
        }
        return result;
    }
}

public class Factorial {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Factorial Number: ");
        int n = sc.nextInt();
        c.Fact(n);
        System.out.println("Factorial of "+n+" is "+c.result);
    }
}
