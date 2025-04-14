import java.util.Scanner;
class Student {
    private int rollNo;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    protected int sub1;
    protected int sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void getMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

interface Sports {
    int sMarks = 25; 

    void set(); 
}

class Result extends Test implements Sports {
    public void set() {
        System.out.println("Sports Marks: " + sMarks);
    }

    public void displayResult() {
        System.out.println("Roll Number: " + getRollNo());
        getMarks();
        set();
        int total = sub1 + sub2 + sMarks;
        System.out.println("Total Marks (including Sports): " + total);
    }
}

class StudentResult{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        r.setRollNo(roll);

        System.out.print("Enter Marks for Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Marks for Subject 2: ");
        int m2 = sc.nextInt();
        r.setMarks(m1, m2);

        System.out.println("\n Student Result:");
        r.displayResult();

        sc.close();
    }
}
