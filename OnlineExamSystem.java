                                      // Online Exam - Project
                                      // Submitted By -
                                      // ABHISHEK KUMAR PATHAK
import java.util.Scanner;

public class OnlineExamSystem {
    static Scanner scanner = new Scanner(System.in);
    static String username;
    static String password;

    public static void main(String[] args) {
        login();
        updateProfileAndPassword();
        selectAnswersForMCQ();
        timerAndAutoSubmit();
        closeSessionAndLogout();
    }

    public static void login() {
        System.out.println("Welcome to Online Exam!");
        System.out.print("Please enter your username: ");
        username = scanner.nextLine();
        System.out.print("Please enter your password: ");
        password = scanner.nextLine();

        // authenticate the user here
        System.out.println("Login successful!");
    }

    public static void updateProfileAndPassword() {
        // For Profile And Password Update
        System.out.println("Update Profile and Password");
        System.out.print("Enter your new name: ");

        String newName = scanner.nextLine();
        // New Password 
        System.out.print("Enter your new password: ");
        String newPassword = scanner.nextLine();

        // update the user's profile and password here
        System.out.println("Profile and password updated successfully!");
    }

    public static void selectAnswersForMCQ() {
        System.out.println("Select Answers for MCQ");

        // present the MCQ questions here and prompt the user to select Answers
        System.out.println("Answers selected successfully!");
    }

    public static void timerAndAutoSubmit() {
        System.out.println("Timer and Auto Submit");

        // You Can Change it As Per Your Need
        int remainingTime = 120; // in seconds 
        while (remainingTime > 0) {
            System.out.println("Remaining time: " + remainingTime + " seconds");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            remainingTime--;
        }

        // submit the answers automatically here
        System.out.println("Time's up! Answers submitted Successfully .");
    }

    public static void closeSessionAndLogout() {
        System.out.println(" Closing session and logout ");

        // close the session and log out the user here
        System.out.println("Session Closed and logged out successfully!");
    }
}
                                     


                                         // ABHISHEK KUMAR PATHAK
                                         // DATE - 16/03/2023