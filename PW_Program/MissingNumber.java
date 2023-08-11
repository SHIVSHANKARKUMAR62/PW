package PW_Program;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        int []a = {1,2,3,4,6,7,8};
        int n = 8;
        int s = n*(n+1)/2;
        int sum = 0;
        for (int i =0 ;i<a.length;i++){
            sum = sum + a[i];
        }
        int ss = s - sum;
        System.out.println("Missing Number is:- "+ss);
    }
}
