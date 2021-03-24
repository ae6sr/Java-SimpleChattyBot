import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int toBeShipped = 0;
        int toBeFixed = 0;
        int toBeRejected = 0;

        for (int i = 0; i < n; i++) {
            int nextPart = scanner.nextInt();
            scanner.nextLine();

            if (nextPart == 0) {
                toBeShipped++;
            } else if (nextPart == 1) {
                toBeFixed++;
            } else if (nextPart == -1) {
                toBeRejected++;
            }
        }
        System.out.println(toBeShipped + " " + toBeFixed + " " + toBeRejected);
    }
}