package PW_Program.Assignment;

import java.util.Scanner;

abstract  class Shape{
    double area;
    abstract public void acceptInput();
    abstract public void compute();
    public void display(){
        System.out.println("Area is : "+area);
    }
}

class Square extends Shape{

    private double length;

    @Override
    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the Square: ");
        length = sc.nextDouble();
    }

    @Override
    public void compute() {
        area = length * length;
    }
}

class Rectangle extends Shape{

    private double length,breath;

    @Override
    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the Rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter breath of the Rectangle: ");
        breath = sc.nextDouble();
    }

    @Override
    public void compute() {
        area = length * breath;
    }
}

class Circle extends Shape{

    private double radius;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the Circle: ");
        radius = sc.nextDouble();
    }

    @Override
    public void compute() {
        area = Math.PI * Math.pow(radius,2);
    }
}

class Calculation{
    public void Cal(Shape rf){
        rf.acceptInput();
        rf.compute();
        rf.display();
    }
}

public class Assignment03 {
    public static void main(String[] args) {

        System.out.println("Tight Bounding...................");

        Square s = new Square();
        s.acceptInput();
        s.compute();
        s.display();
        Rectangle r = new Rectangle();
        r.acceptInput();
        r.compute();
        r.display();
        Circle c = new Circle();
        c.acceptInput();
        c.compute();
        c.display();

        System.out.println("Loose Bounding...................");

        Calculation calculation = new Calculation();
        calculation.Cal(s);  // Square
        calculation.Cal(r);  // Rectangle
        calculation.Cal(c);  // Circle

    }
}
