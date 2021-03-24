import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        scanner.nextLine();
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        for (int i = 0; i < students; i++) {
            int grade = scanner.nextInt();
            scanner.nextLine();

            if (grade == 5) {
                gradeA++;
            } else if (grade == 4) {
                gradeB++;
            } else if (grade == 3) {
                gradeC++;
            } else if (grade == 2) {
                gradeD++;
            }
        }

        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
    }
}