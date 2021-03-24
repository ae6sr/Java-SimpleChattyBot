import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int n = scanner.nextInt();

        int remainder = n % 2;

        int nextEven = n + (2 - remainder);

        System.out.println(nextEven);
    }
}