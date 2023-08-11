package PW_Program.Recursion;

import java.util.Scanner;

class SumCalculation{

    int result;
    public int Cal(int n){
        if(n != 0){
            result = n + Cal(n-1);
            System.out.println(n+"+"+result);
        }
            return result;
    }
}

public class Sum {
    public static void main(String[] args) {
        SumCalculation c = new SumCalculation();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        c.Cal(n);
        System.out.println("Sum of "+n+" is "+c.result);
    }
}

