import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();
        int divisor = scanner.nextInt();

        int result = 0;

        for (int i = startRange; i <= endRange; i++) {
            if (i % divisor == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}