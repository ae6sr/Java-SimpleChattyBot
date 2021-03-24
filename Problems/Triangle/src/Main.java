import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int sideA = scanner.nextInt();
        scanner.nextLine();
        int sideB = scanner.nextInt();
        scanner.nextLine();
        int sideC = scanner.nextInt();

        String result;

        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            result = "YES";
        } else {
            result = "NO";
        }

        System.out.println(result);
    }
}