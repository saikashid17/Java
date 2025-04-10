import java.util.Scanner;
class Student {
    int roll_no;

    void getRoll(int roll) {
        roll_no = roll;
    }

    void showRoll() {
        System.out.println("Roll Number: " + roll_no);
    }
}
class Test extends Student {
    int sub1, sub2;

    void getMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }

    void showMarks() {
        System.out.println("Marks - Subject 1: " + sub1);
        System.out.println("Marks - Subject 2: " + sub2);
    }
}
class Result extends Test {
    void displayResult() {
        int total = sub1 + sub2;
        double average = total / 2.0;
        showRoll();
        showMarks();
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }
}

class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks for Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int s2 = sc.nextInt();

        r.getRoll(roll);
        r.getMarks(s1, s2);

        System.out.println("\n Result:");
        r.displayResult();
    }
}
