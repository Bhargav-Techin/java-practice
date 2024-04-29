package oops;

class AllStudents {
    public void read(){
        System.out.println("read");
    }
}

class PrimaryStudents extends AllStudents {
    public void readprimary(){
        System.out.println("read primary");
    }
}

class HighSchoolStudents extends PrimaryStudents {
    public void readhigh(){
        System.out.println("read high school");
    }
}

public class MultiLevelinheritance {
    
    public static void main(String[] args) {
        HighSchoolStudents hs = new HighSchoolStudents();
        hs.read();
        hs.readprimary();
        hs.readhigh();
    }
}
