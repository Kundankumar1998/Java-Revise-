import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        int roll;
        String name;
        float amount;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        roll = sc.nextInt();

        // Consume the newline character left by nextInt()
        sc.nextLine();

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter amount: ");
        amount = sc.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Amount: " + amount);

        sc.close();
    }
}
