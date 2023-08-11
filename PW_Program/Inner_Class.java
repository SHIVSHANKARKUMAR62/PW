package PW_Program;

class A{
    public void show(){
        System.out.println("In Show...");
    }

    // static in class

    static class B{
        public void display(){
            System.out.println("In Display...");
        }
    }

    // member in class

    class C{
        public void displaying(){
            System.out.println("In Displaying...");
        }
    }

}

public class Inner_Class {
    public static void main(String[] args) {
        A a = new A();
        A.B ab = new A.B();  // this is the object is created for no static class.
        A.C ac = a.new C();  // this is the object is created for no static class.
        a.show();
        ab.display();
        ac.displaying();
    }
}
