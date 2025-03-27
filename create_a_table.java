import java.util.Scanner;

public class create_a_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to create its multiplication table: ");
        int number = scanner.nextInt();

        System.out.print("Enter the range for the table:");
        int range = scanner.nextInt();

        // Generate the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}