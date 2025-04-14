/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;

public class UtilityTestExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registration ===");

        
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        
        System.out.print("Enter username (must contain underscore and be max 5 characters): ");
        String username = scanner.nextLine();

        
        System.out.print("Enter password (must be 8+ chars, capital letter, number, special char): ");
        String password = scanner.nextLine();

       
        System.out.print("Enter South African phone number with country code (e.g. +2782123456): ");
        String phone = scanner.nextLine();

        // Login object
        Login user = new Login(firstName, lastName, username, password, phone);

        
        String registrationMessage = user.registerUser();
        System.out.println(registrationMessage);

        
        if (!registrationMessage.equals("User registered successfully.")) {
            return;
        }

        
        System.out.println("\n=== Login ===");
        System.out.print("Enter username: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine();

        // Attempt login
        String loginStatus = user.returnLoginStatus(loginUsername, loginPassword);
        System.out.println(loginStatus);

        scanner.close();
    }
}
