package PW_Program;

import java.util.Set;

public class Duplicate_Element {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6};
        int []b = {1,2,3,4,5,6};
        int []sum = {};
        for (int i =0; i<a.length; i++){
            for (int j =0; j<b.length; j++){
               sum[j] = a[i] + b[i];
                System.out.println(a[i]);
            }
        }
        System.out.print("Elements are:- ");
        for (int i =0;i<a.length;i++){
            System.out.print(sum[i]);
        }
    }
}
