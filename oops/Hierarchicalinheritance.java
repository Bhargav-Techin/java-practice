package oops;

class A {
    public void print_A() { System.out.println("Class A"); }
}
 
class B extends A {
    public void print_B() { System.out.println("Class B"); }
}
 
class C extends A {
    public void print_C() { System.out.println("Class C"); }
}
 
class D extends A {
    public void print_D() { System.out.println("Class D"); }
}

public class Hierarchicalinheritance {

    public static void main(String[] args) {
        B objB = new B();
        objB.print_B();
        objB.print_A();

        C objC = new C();
        objC.print_C();
        objC.print_A();

        D objD = new D();
        objD.print_D();
        objD.print_A();
    }
    
}
