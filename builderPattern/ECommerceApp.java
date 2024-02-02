package builderPattern;

import java.util.*;

public class ECommerceApp {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("====== Welcome to the Application Registration Form! ======");
        System.out.println("Please fill-up the form.\n");

        System.out.print("Enter your first name: ");
        String firstName = userInput.nextLine().trim();
        while (firstName.isEmpty()) {
            System.out.println("This is required. Please enter your first name.\n");
            System.out.print("Enter your first name: ");
            firstName = userInput.nextLine().trim();
        }

        System.out.print("Enter your last name: ");
        String lastName = userInput.nextLine();
        while (lastName.isEmpty()) {
            System.out.println("This is required. Please enter your last name.\n");
            System.out.print("Enter your last name: ");
            lastName = userInput.nextLine().trim();
        }

        System.out.print("Enter your email (optional): ");
        String email = userInput.nextLine();

        System.out.print("Enter your address (optional): ");
        String address = userInput.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = userInput.nextLine();
        while (phone.isEmpty()) {
            System.out.println("This is required. Please enter your phone number.\n");
            System.out.print("Enter your phone number: ");
            phone = userInput.nextLine().trim();
        }

        Integer age;
        while (true) {
            System.out.print("Enter your age: ");
            String input = userInput.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("This is required. Please enter your age.\n");
                continue;
            }

            try {
                age = Integer.parseInt(input);

                if (age <= 0) {
                    System.out.println("Please enter a valid positive age.\n");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error! Please enter a valid age.\n");
            }
        }

        User user = new User.UserBuilder()
                  .age(age)
                  .lastName(lastName)
                  .phone(phone)
                  .address(address)
                  .firstName(firstName)
                  .email(email)
                  .build();


        System.out.println("\n");
        System.out.println("====== User Information ======\n");
        System.out.println("First Name: " + user.firstName);
        System.out.println("Last Name: " + user.lastName);
        System.out.println("Email: " + user.email);
        System.out.println("Address: " + user.address);
        System.out.println("Phone: " + user.phone);
        System.out.println("Age: " + user.age);

        userInput.close();
    }
}