package PW_Program.Interface;

interface A {

    // in interface static method only created

    void display();

    static void show(){
        System.out.println("Show In...");
    }
}

@FunctionalInterface   // this is optional part.
interface C{
    void enjoy();
}

class B implements A{
    public void display(){
        System.out.println("Display In...");
    }

}

public class Interface_classes {
    public static void main(String[] args) {
        B b = new B();
        b.display();
        A.show(); // this is a way to call the show method

        // these are the way to define interface method without implement the class.these are called as anonymous  classes.

        C c = new C(){
            public void enjoy(){
                System.out.println("Enjoying In..");
            }
        };

        c.enjoy();

        C cc = () -> {
            System.out.println("Displaying in other way...");
        };

        // lambda expression treated as a Function itself. we use value also in one value we don,t used () we direct access the value name inb two value we use (a,b)

        C ccc = () -> System.out.println("Display i8n Third way");  // this is a lambda expression.this works on function interface when your interface have only one method then they work otherwise not works.
        cc.enjoy();
        ccc.enjoy();

    }
}
