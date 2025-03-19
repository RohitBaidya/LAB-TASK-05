import java.util.Scanner;

public class BanglaSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
        
        switch (month) {
            case 3: case 4: case 5:
                System.out.println("Summer Season");
                break;
            case 6: case 7: case 8:
                System.out.println("Rainy Season");
                break;
            case 9: case 10:
                System.out.println("Autumn Season");
                break;
            case 11:
                System.out.println("Late Autumn Season");
                break;
            case 12: case 1: case 2:
                System.out.println("Winter Season");
                break;
            default:
                System.out.println("Invalid month number!");
        }
        
        scanner.close();
    }
}
