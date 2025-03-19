import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();
        
        double result = Math.pow(base, exponent);
        
        System.out.println(base + "^" + exponent + " = " + result);
        scanner.close();
    }
}
