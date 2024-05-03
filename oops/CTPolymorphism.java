package oops;

class Calculation {
    static int add (int x , int y){
        return x+y;
    }

    static double add (double x , double y){
        return x+y;
    }

    static int add (int x , int y , int z){
        return x+y+z;
    }
}

public class CTPolymorphism {
    public static void main(String[] args) {
        System.out.println(Calculation.add(10,20));
        System.out.println(Calculation.add(10.5,20.5));

        System.out.println(Calculation.add(10,20,30));
    }
}