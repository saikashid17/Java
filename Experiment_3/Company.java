import java.util.Scanner;
class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    void calculateBonus() {
        double bonus = salary * 0.10;
        System.out.println(jobTitle + " Bonus: Rs. " + bonus);
    }

    void generateReport() {
        System.out.println("Performance report for " + jobTitle + " " + name);
    }

    void manageProject() {
        System.out.println(jobTitle + " " + name + " is working on a project.");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Address: " + address);
        System.out.println("Salary: Rs. " + salary);
    }
}


class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    void calculateBonus() {
        double bonus = salary * 0.20;
        System.out.println("Manager Bonus: Rs. " + bonus);
    }

    @Override
    void manageProject() {
        System.out.println("Manager " + name + " is overseeing projects.");
    }
}

class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    void calculateBonus() {
        double bonus = salary * 0.15;
        System.out.println("Developer Bonus: Rs. " + bonus);
    }

    @Override
    void manageProject() {
        System.out.println("Developer " + name + " is working on development tasks.");
    }
}

class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    void calculateBonus() {
        double bonus = salary * 0.12;
        System.out.println("Programmer Bonus: Rs. " + bonus);
    }

    @Override
    void manageProject() {
        System.out.println("Programmer " + name + " is debugging and testing.");
    }
}


class Company{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Manager details:");
        System.out.print("Name: ");
        String mName = sc.nextLine();
        System.out.print("Address: ");
        String mAddress = sc.nextLine();
        System.out.print("Salary: ");
        double mSalary = sc.nextDouble();
        sc.nextLine(); 
        Manager manager = new Manager(mName, mAddress, mSalary);
        
System.out.println("\nEnter Developer details:");
        System.out.print("Name: ");
        String dName = sc.nextLine();
        System.out.print("Address: ");
        String dAddress = sc.nextLine();
        System.out.print("Salary: ");
        double dSalary = sc.nextDouble();
        sc.nextLine();
        Developer developer = new Developer(dName, dAddress, dSalary);
       
 System.out.println("\nEnter Programmer details:");
        System.out.print("Name: ");
        String pName = sc.nextLine();
        System.out.print("Address: ");
        String pAddress = sc.nextLine();
        System.out.print("Salary: ");
        double pSalary = sc.nextDouble();
        Programmer programmer = new Programmer(pName, pAddress, pSalary);

        
        System.out.println("\nManager:");
        manager.displayInfo();
        manager.calculateBonus();
        manager.generateReport();
        manager.manageProject();

        System.out.println("\nDeveloper:");
        developer.displayInfo();
        developer.calculateBonus();
        developer.generateReport();
        developer.manageProject();

        System.out.println("\nProgrammer:");
        programmer.displayInfo();
        programmer.calculateBonus();
        programmer.generateReport();
        programmer.manageProject();
    }
}

