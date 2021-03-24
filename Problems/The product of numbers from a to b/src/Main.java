import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();
        long result = startRange;

        for (int i = startRange + 1; i < endRange; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}