package oops;
import java.util.*;
public class Students {
    int roll;
    float marks;
    String name;
    Students()
    {
        roll=0;
        marks=0f;
        name="";
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll, marks, and name");
        roll=sc.nextInt();
        marks=sc.nextFloat();
        name=sc.nextLine();
    }

    void calculate()
    {
        marks=marks+10;
    }

    void display()
    {
        System.out.println("Roll :"+roll);
        System.out.println("Marks :"+marks);
        System.out.println("Name :"+name);
    }
    
    void main()
    {
        Students ob=new Students();
        ob.input();
        ob.calculate();
        ob.display();
    }
    
}
