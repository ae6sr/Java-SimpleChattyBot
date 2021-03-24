import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int rootA = scanner.nextInt();
        scanner.nextLine();
        int rootB = scanner.nextInt();
        scanner.nextLine();
        int rootC = scanner.nextInt();
        scanner.nextLine();
        int rootD = scanner.nextInt();

        for (int i = 0; i < 1001; i++) {
            if ((rootA * i * i * i) + (rootB * i * i) + (rootC * i) + rootD == 0) {
                System.out.println(i);
            }
        }
    }
}