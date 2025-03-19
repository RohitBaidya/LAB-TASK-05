import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = scanner.nextInt();
        
        int sum = (n * (n + 1)) / 2;
        
        System.out.println("Sum of the series: " + sum);
        scanner.close();
    }
}
