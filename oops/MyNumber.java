package oops;

public class MyNumber {
    int n;
    int fact;

    MyNumber(int nn) {
        n = nn;
        fact = 1;
    }

    int calculateFact(int num1 ) {
        fact=1;
        if (num1 == 0 || num1 == 1) {
            return 1;
        } else {
            for (int i = 1; i <=num1; i++) {
                fact = fact * i ;
            }
            return fact;
        }
    }

    void display(){
        System.out.println("Value of factorial : " + fact);
        System.out.println("Value of given number : " + n);
    }
    
    
}
