package oops;


class animal {
    void eat(String name) {
        System.out.println(name +" eating");
    }
}

class dog extends animal {
    void bark(String name) {
        System.out.println(name + " barking");
    }
}


public class SingleInheritance {

    public static void main(String[] args) {
        dog d = new dog();
        d.eat("Tommy");
        d.bark("Tommy");
    }
    
}
