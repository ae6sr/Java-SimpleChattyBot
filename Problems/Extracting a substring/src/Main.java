import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        System.out.println(str1.substring(startIndex, endIndex + 1));
    }
}