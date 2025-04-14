/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Utility {
    private String userName;
    private int userId;

    // Constructor
    public Utility(String userName, int userId) {
        this.userName = userName;
        this.userId = userId;
    }

    // Getters
    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    // Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    
    public String greetUser(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }

    // Integer method: multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }
}
