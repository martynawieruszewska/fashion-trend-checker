import java.util.Scanner;

public class TrendChecker {
    public static void main(String[] args) {
        int choice; 

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to my fahsion trends project!");
        System.out.println("Pick a year to unveil the most notable seasonal trends: ");
        System.out.println("(1) 2024");
        System.out.println("(2) 2025");

        choice = input.nextInt();
        switch(choice) {
            case 1:
            System.out.println("You've selected 2024.");
            case 2:
            System.out.println("You've selected 2025.");
            default:
            System.out.println("Invalid choide, try again!");
        }
        input.close();
    }
}
