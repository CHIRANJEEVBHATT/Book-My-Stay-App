/**
 * Book My Stay Application
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * This class represents the entry point of the Hotel Booking Management System.
 * It demonstrates how a Java application begins execution using the main() method
 * and prints a welcome message to the console.
 *
 * @author Chiranjeev
 * @version 1.0
 */
public class BookMyStayApp {

    /**
     * Main method - Entry point of the Java application.
     * The JVM starts execution from this method.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Application Name
        String appName = "Book My Stay - Hotel Booking Management System";

        // Version Information
        String version = "Version 1.0";

        // Welcome Message
        System.out.println("======================================");
        System.out.println("        Welcome to Book My Stay       ");
        System.out.println("======================================");

        // Display application details
        System.out.println("Application : " + appName);
        System.out.println("Release     : " + version);

        System.out.println("--------------------------------------");
        System.out.println("Application started successfully.");
        System.out.println("Thank you for using Book My Stay!");
        System.out.println("--------------------------------------");

    }
}