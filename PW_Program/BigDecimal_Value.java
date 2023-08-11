package PW_Program;

import java.math.BigDecimal;

public class BigDecimal_Value {
    public static void main(String[] args) {
        // double and float doesn't return exist value , we used BigDecimal  value
        // BigDecimal return accurate value, this is a class and there have a lot of maths method.java 1.1 version develop this.
        double p = 0.06;
        double q = 0.04;
        double r = p - q;
        System.out.println(r);
        float s = 0.06f;
        float t = 0.04f;
        float u = s - t;
        System.out.println(u);
        System.out.println();
        BigDecimal a = new BigDecimal("0.06");
        BigDecimal b = new BigDecimal("0.04");
        BigDecimal c = a.subtract(b);
        BigDecimal d = a.add(b);
        BigDecimal e = a.multiply(b);
        BigDecimal f = a.divide(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        String name1 = "Shiv";
        String name2 = "Shan";
        if (name1.equals(name2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
