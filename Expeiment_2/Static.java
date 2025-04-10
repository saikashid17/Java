public class Static{

    // Static variable
    static int count;

    // Static block 
    static {
        count = 10;
        System.out.println("Static block executed. Count initialized to " + count);
    }

    // Static method
    static void showCount() {
        System.out.println("Value of static variable 'count' is: " + count);
    }

   
    public static void main(String[] args) {
        System.out.println("Main method started.");
        Static.showCount();  // Call static method without object
        Static.count = 25;   // Modify static variable
        Static.showCount();  // Call again
    }
}
