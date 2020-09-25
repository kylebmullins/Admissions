import java.util.Scanner;
public class Admissions {
    public static void main(String[] args) {
        int SAT = askInt("What was the student's highest SAT score?");
        int rank = askInt("What was the student's class ranking?");
        int awards = askInt("How many awards were earned by the student?");
        String surname = askString("What is the student's last name?");
        String firstname = askString("What wis the student's first name?");
        String residence = askString("In which state does the student currently reside?");
    }

    public static int askInt(String question) {
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        int ask = scan.nextInt();
        scan.close();
        return ask;
    }

    public static String askString(String question) {
        Scanner scan = new Scanner(System.in);
        System.out.println(question);
        String ask = scan.nextLine();
        scan.close();
        return ask;
    }

    public static int testElite(int value, int condition, int acceptCondition) {
        int back;
        if (value >= condition) {
            back = 8;
        }
    }
}