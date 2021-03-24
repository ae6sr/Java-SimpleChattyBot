import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int firstHour = scanner.nextInt();
        int firstMinutes = scanner.nextInt();
        int firstSeconds = scanner.nextInt();
        int secondHour = scanner.nextInt();
        int secondMinutes = scanner.nextInt();
        int secondSeconds = scanner.nextInt();

        int firstTimeInSeconds = (firstHour * 60 + firstMinutes) * 60 + firstSeconds;
        int secondTimeInSeconds = (secondHour * 60 + secondMinutes) * 60 + secondSeconds;

        System.out.println(secondTimeInSeconds - firstTimeInSeconds);
    }
}