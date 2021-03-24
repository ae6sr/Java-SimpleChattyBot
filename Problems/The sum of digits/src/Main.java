import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int n = scanner.nextInt();

        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int ones = n % 10;

        System.out.println(hundreds + tens + ones);
    }
}