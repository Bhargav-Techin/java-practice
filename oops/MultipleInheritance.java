package oops;

interface Oops {
    void inheritance ();
}

interface DataStructure {
    void array ();
}

class BTech implements Oops , DataStructure {

    public void inheritance () {
        System.out.println("B.tech have inheritance");
    }
    public void array () {
        System.out.println("B.tech have array");
    }

}

class BA implements Oops , DataStructure {
    public void inheritance () {
        System.out.println("B.A dont have inheritance");
    }

    public void array () {
        System.out.println("B.A dont have array");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        BTech btech = new BTech();
        btech.inheritance();
        btech.array();

        BA ba = new BA();
        ba.inheritance();
        ba.array();
    }
    
}
