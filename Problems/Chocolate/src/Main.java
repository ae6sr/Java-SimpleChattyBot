import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int lengthN = scanner.nextInt();
        scanner.nextLine();
        int widthM = scanner.nextInt();
        scanner.nextLine();
        int segmentsK = scanner.nextInt();

        String result;

        if (segmentsK % lengthN == 0 && segmentsK / lengthN < widthM
                || segmentsK % widthM == 0 && segmentsK / widthM < lengthN) {
            result = "YES";
        } else {
            result = "NO";
        }

        System.out.println(result);
    }
}