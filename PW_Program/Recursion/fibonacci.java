package PW_Program.Recursion;

import java.util.Scanner;

class FCalculation{
    int result;
    public int Fib(int n){
        if (n==0 || n==1){
            return n;
        }else{
            result = Fib(n-1) + Fib(n-2);
        }
        return result;
    }
}

public class fibonacci {
    public static void main(String[] args) {
        FCalculation c = new FCalculation();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fibonacci Number: ");
        int n = sc.nextInt();
        c.Fib(n);
        System.out.println("Fibonacci of "+n+" is "+c.result);
    }
}
