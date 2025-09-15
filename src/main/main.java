
package main;

import config.config;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         config conf = new config();
         
         int choice;

        do {
            System.out.println("\n===== Student Information System =====");
            System.out.println("1. Enter Student Info");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String f_name = sc.nextLine();

                    System.out.print("Enter Last Name: ");
                    String l_name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();

                    System.out.print("Enter Year Level: ");
                    String year_level = sc.nextLine();

                    System.out.print("Enter Status: ");
                    String status = sc.nextLine();

                    System.out.println("\n--- Student Information ---");
                    System.out.println("First Name : " + f_name);
                    System.out.println("Last Name  : " + l_name);
                    System.out.println("Email      : " + email);
                    System.out.println("Password   : " + password);
                    System.out.println("Year Level : " + year_level);
                    System.out.println("Status     : " + status);
                    
                    
                    String sql = "INSERT INTO tbl_student ( f_name, l_name, s_email, password, year_level, status)  VALUES (?, ?, ?, ?, ?, ?)";
                    conf.addRecord(sql, f_name, l_name, email, password, year_level, status);
                break;
                
                case 2:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 2);

        sc.close();
    }
}
        
         
         
    

