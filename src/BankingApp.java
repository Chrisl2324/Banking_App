import java.util.Scanner;
public class BankingApp extends ATM {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        BankingApp one = new BankingApp();
        one.menu();
    }
    public void menu() {
        int num;
        System.out.print("Enter number of customers: ");
        num = scan.nextInt();
        ATM[] customers = new ATM[num];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new ATM();
            customers[i].account_info();
        }
        int x;
        char again = 'y';
        while (again == 'y') {
            System.out.println("WELCOME TO THE BANKING APP!");
            System.out.println("---------------------------");
            System.out.println("1. DISPLAY ALL ACCOUNTS \n2. SEARCH BY ACCOUNT NUMBER \n3. WITHDRAWAL \n4. DEPOSIT \n5. EXIT");
            System.out.println("---------------------------");
            System.out.print("Choose an option: ");
            x = scan.nextInt();
            if (x == 1) {
                for (int i = 0; i < customers.length; i++) {
                    customers[i].display_account();
                    System.out.println();
                }
            } else if (x == 2) {
                System.out.print("Enter account number to search: ");
                String acc = scan.next();
                boolean exists;
                for (int i = 0; i < customers.length; i++) {
                    exists = customers[i].search(acc);
                    if (!exists) {
                        System.out.println("Account number does not exist!");
                    }
                }
            } else if (x == 3) {
                System.out.println("Enter account number: ");
                String acc = scan.next();
                boolean exists;
                for (int i = 0; i < customers.length; i++) {
                    exists = customers[i].search(acc);
                    if (exists = true) {
                        customers[i].withdrawal();
                    } else if (!exists) {
                        System.out.println("Account not found!");
                    }
                }
            } else if (x == 4) {
                System.out.println("Enter account number: ");
                String acc = scan.next();
                boolean exists;
                for (int i = 0; i < customers.length; i++) {
                    exists = customers[i].search(acc);
                    if (exists = true) {
                        customers[i].deposit();

                    } else if (!exists) {
                        System.out.println("Account not found!");
                    }
                }
            }
            else {
                System.out.println("Choose another transaction?");
                again = scan.next().charAt(0);
            }
            if(again == 'n') {
                System.out.println("Have a nice day!");
            }
        }
    }
}