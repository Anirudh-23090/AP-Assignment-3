import javax.security.auth.login.LoginContext;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class ByteMe {
    private long sales;
    private Menu menu;
    private Scanner read = new Scanner(System.in);
    private String input;
    private LinkedList<Order> orders;
    private LinkedHashMap<Integer, Order> history;
    private HashMap<String, Customer> customers;

    public ByteMe() {
        menu = new Menu();
        orders = new LinkedList<Order>();
        history = new LinkedHashMap<Integer, Order>();
    }

    public void run() {
        System.out.println("Welcome to ByteMe");
        System.out.println("Do you want to enter the system? [Y/N]");
        input = read.nextLine();
        while (input.equalsIgnoreCase("Y")) {
            System.out.println("Don't have an account? [Y/N]");
            input = read.nextLine();
            if (input.equalsIgnoreCase("Y"))
                SignIn();
            else if (input.equalsIgnoreCase("N"))
                LogIn();
            System.out.println("Do you want to continue? [Y/N]");
        }
    }

    private void SignIn() {
        System.out.println("Sign-in as [Regular/VIP]");
        input = read.nextLine();
        if (input.equalsIgnoreCase("Regular")) {
            System.out.println("Enter your name");
            String name = read.nextLine();
            System.out.println("Enter your Password");
            String password = read.nextLine();
            Customer customer = new Customer(name, password, "Regular");
            customers.put(name, customer);
            System.out.println("Successfully registered as Regular Customer");
        } else if (input.equalsIgnoreCase("VIP")) {
            System.out.println("Enter your name");
            String name = read.nextLine();
            System.out.println("Enter your Password");
            String password = read.nextLine();
            Customer customer = new Customer(name, password, "VIP");
            customers.put(name, customer);
            System.out.println("Successfully registered as VIP Customer");
        }
    }

    private void LogIn() {
        System.out.println("Log-in as [Customer/Admin]");
        input = read.nextLine();
        if (input.equalsIgnoreCase("Customer")) {
            CustomerLogIn();
        } else if (input.equalsIgnoreCase("Admin")) {
            AdminLogIn();
        }
    }

    private void CustomerLogIn() {
        System.out.println("Enter your Name");
        String name = read.nextLine();
        System.out.println("Enter your Password");
        String password = read.nextLine();
        Customer customer = customers.get(name);
        if (password.equals(customer.getPassword())) {
            CustomerInterface(customer);
        } else {
            System.out.println("Invalid Password");
        }
    }

    private void AdminLogIn() {
        System.out.println("Enter Admin Password");
        String password = read.nextLine();
        if (password.equals("Admin@ByteMe")) {
            AdminInterface();
        } else {
            System.out.println("Invalid Password");
        }
    }

    private void CustomerInterface(Customer customer) {

    }

    private void AdminInterface() {

    }
}
