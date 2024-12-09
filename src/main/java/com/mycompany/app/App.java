package com.mycompany.app;

//This is a chenge for feature branch. This should not be visible in master.

/**
 * Hello world!
 */
public class App {


    private final String message = "Hello from Upshiftnow!";


    public App() {}

    public static void main(String[] args) {
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }
}
