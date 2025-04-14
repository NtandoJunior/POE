/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    private String username;
    private String password;
    private String cellPhone;
    private String firstName;
    private String lastName;

    private String storedUsername;
    private String storedPassword;

    public Login(String username, String password, String cellPhone, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity() {
        return password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+{}\\[\\]:;<>,.?/~`]).{8,}$");
    }

    public boolean checkCellPhoneNumber() {
        return cellPhone.matches("^\\+27\\d{9}$");
    }

    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber()) {
            return "Cell phone number is invalid. Please include the international country code and ensure it's no more than 10 digits long after the code.";
        }

        storedUsername = username;
        storedPassword = password;
        return "User registered successfully.";
    }

    public boolean loginUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword);
    }

    public String returnLoginStatus() {
        if (loginUser(username, password)) {
            return "Welcome " + firstName + " ,Smith it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }

    public String returnLoginStatus(String inputUsername, String inputPassword) {
        if (loginUser(inputUsername, inputPassword)) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
