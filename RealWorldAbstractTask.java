abstract class BankAccount{
    double minBalance = 3000.0;
    double balance = 0.0 + minBalance;
    public void deposit(double deposit){
        System.out.println("you are depositing");
        balance += deposit;
        System.out.println("your current balance = "+balance);
    }
    public abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount{
    @Override
    public void withdraw(double amount){
        if(amount <= balance - minBalance){
            System.out.println("you are withdrawing money");
            balance = balance - amount;
            System.out.println("your current balance = "+balance);
        }
        else{
            System.out.println("your minimum balance is low");
            System.out.println("your current balance = "+balance);

        }
    }
}
class CurrentAccount extends BankAccount{
    @Override
    public void withdraw(double amount){
        System.out.println("you are withdrawing money");
        balance = balance - amount;
        System.out.println("your current balance = "+balance);

    }
}
public abstract class RealWorldAbstractTask {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(1100);
        sa.withdraw(4500.0);
        CurrentAccount ca = new CurrentAccount();
        ca.deposit(200);
        ca.withdraw(2900.0);
    }
}
