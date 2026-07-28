package OOPs;

class BankAccount {

    private double balance;

    public void deposite(double amount){
        if(amount>0) {
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance(){
        return balance;
    }
}

public class Encapsulation_Bank_Account {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.deposite(5000);
        account.withdraw(2000);
        System.out.println("Balance = " + account.getBalance());
        account.withdraw(4000);
    }
}
