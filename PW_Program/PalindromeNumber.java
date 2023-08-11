package PW_Program;

import java.util.Scanner;

class Pali {

    int temp = 0;

    public int Calculation(int n) {
        if (n>0){
            while (n>0){
                temp=temp*10+n%10;
                n=n/10;
            }
            //return temp;
        }else{
            while (n<0){
                temp=temp*10+n%10;
                n=n/10;
                System.out.println(temp);
                System.out.println("..........");
                System.out.println(n);
            }
        }
         return temp;

    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        //System.out.println(p.Calculation(num)); PalindromeNumber z=num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int num = sc.nextInt();
        Pali p = new Pali();
        int s = p.Calculation(num);
        if (num == s){
            System.out.println(s+" is a PalindromeNumber.");
        }else {
            System.out.println(s+" is not a PalindromeNumber.");
        }
    }
}
