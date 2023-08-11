package PW_Program.Assignment;

public class Getter_Setter {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getA());
        a.setA(50);
        System.out.println(a.getA());
        System.out.println(a.getB());
        a.setB(50);
        System.out.println(a.getB());
    }
}

class  A {
    private int a = 10;
    private int b = 10;

    public void setA(int a){
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }
}