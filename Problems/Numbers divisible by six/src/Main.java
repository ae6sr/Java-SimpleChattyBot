import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        scanner.nextLine();
        int sumOfElements = 0;

        for (int i = 0; i < numberOfElements; i++) {
            int nextElement = scanner.nextInt();
            scanner.nextLine();

            if (nextElement % 6 == 0) {
                sumOfElements += nextElement;
            }
        }

        System.out.println(sumOfElements);
    }
}