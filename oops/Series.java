package oops;
public class Series extends MyNumber{
    int sum;
    int num;
    Series(int value){
        super(value);
        sum=0;
        num=value;
    }

    void calculateSum() {
        {
            for (int i = 1; i <= num; i++){
                sum +=super.calculateFact(i);
            }
        }
    }

    void display(){
        super.display();
        System.out.println("Value of Sum : " + sum);
        System.out.println("Value of given number : " + num);

    }

    void main (){
        int val = 5;
        Series obj = new Series(val);
        obj.calculateSum();
        obj.display();
    }

}
