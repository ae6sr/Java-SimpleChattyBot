import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int startRange = scanner.nextInt();
        scanner.nextLine();
        int endRange = scanner.nextInt();
        double counter = 0;
        double sum = 0;
        double result;

        for (int i = startRange; i <= endRange; i++) {
            if (i % 3 == 0) {
                counter++;
                sum += i;
            }
        }

        result = sum / counter;

        System.out.println(result);
    }
}