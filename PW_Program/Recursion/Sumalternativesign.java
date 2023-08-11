package PW_Program.Recursion;

class SumCalculationP{

    int result;
    public int Cal(int n){
        if(n != 0){
            result = n + Cal(n-1);
        }
        return result;
    }
}

public class Sumalternativesign {
    public static void main(String[] args) {
        SumCalculationP sp = new SumCalculationP();
        int n = sp.Cal(10);
        System.out.println(sp.result);
    }
}
