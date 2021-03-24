import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        scanner.nextLine();
        int maxElement = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfElements - 1; i++) {
            int nextInput = scanner.nextInt();
            scanner.nextLine();
            if (maxElement % 4 != 0) {
                maxElement = nextInput;
            }

            if (nextInput % 4 == 0 && nextInput > maxElement) {
                maxElement = nextInput;
            }
        }

        System.out.println(maxElement);
    }
}