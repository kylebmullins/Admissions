import java.util.Scanner;
public class Admissions {
    public static void main(String[] args) {
        int SAT = askInt("What was the student's highest SAT score?");
        int rank = askInt("What was the student's class ranking?");
        int awards = askInt("How many awards were earned by the student?");
        String surname = askString("What is the student's last name?");
        String firstname = askString("What wis the student's first name?");
        String residence = askString("In which state does the student currently reside?");
        int SATPass = testInt(SAT, 1500, 1400, 1200);
        int rankPass = testInt(rank, 0, 0, 0);
        int awardsPass = testInt(rank, 0, 0, 0);
        int surnamePass = testSurname(surname);
        int residencePass = testResidence(residence);
        int pass = (SATPass + rankPass + awardsPass + surnamePass + residencePass);
        boolean admitted = false;
        if (pass >= 2) {
            admitted = true;
        } else if (pass < 2) {
            admitted = false;
        }
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

    public static int testInt(int value, int condition, int acceptCondition, int failCondition) {
        int back;
        if (value >= condition) {
            back = 2;
        } else if (value >= acceptCondition) {
            back = 1;
        } else if (value < failCondition) {
            back = -10;
        } else {
            back = 0;
        }
        return back;
    }

    public static int testSurname(String surname) {
        int back;
        if (surname.equals("Padjen")) {
            back = 2;
        } else {
            back = 0;
        }
        return back;
    }

    public static int testResidence(String residence) {
        int back = 0;
        if (residence.equals("Colorado")) {
            back = 2;
        } else if (residence.equals("Florida")) {
            back = -10;
        }
        return back;
    }
}