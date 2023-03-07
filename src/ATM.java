import java.util.Scanner;
public class ATM {
    Scanner scan = new Scanner(System.in);
    private String acc_num;
    private String account_type;
    private long balance;
    private String name;

    public void account_info(){
        System.out.print("Enter account number: ");
        acc_num = scan.next();
        System.out.print("Enter account type: ");
        account_type = scan.next();
        System.out.print("Enter name: ");
        scan.nextLine();
        name = scan.nextLine();
        System.out.print("Enter balance: ");
        balance = scan.nextLong();

    }
    public void display_account(){
        System.out.println("Account Number: " + acc_num);
        System.out.println("Account Type: " + account_type);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
    public void deposit(){
        System.out.print("Enter deposit amount: ");
        long deposit = scan.nextLong();
        balance += deposit;
        System.out.println("Balance is: " + balance);
    }
    public void withdrawal(){
        System.out.print("Enter withdrawal amount: ");
        long withdrawal = scan.nextLong();
        if(withdrawal < balance){
            balance -= withdrawal;
            System.out.println("Balance is: " + balance);
        }
        else{
            System.out.println("You do not have enough to withdraw " + withdrawal + "!");
        }
    }
    public boolean search(String account){
        if(acc_num.equals(account)){
            display_account();
            return true;
        }
        return false;
    }
}