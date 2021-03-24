import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int groupOne = scanner.nextInt();
        int groupTwo = scanner.nextInt();
        int groupThree = scanner.nextInt();

        int desksOne = (groupOne + 1) / 2;
        int desksTwo = (groupTwo + 1) / 2;
        int desksThree = (groupThree + 1) / 2;

        System.out.println(desksOne + desksTwo + desksThree);
    }
}