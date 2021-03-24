import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int startRange = scanner.nextInt();
        scanner.nextLine();
        int endRange = scanner.nextInt();
        int result = 0;

        for (int i = startRange; i <= endRange; i++) {
            result += i;
        }

        System.out.println(result);
    }
}