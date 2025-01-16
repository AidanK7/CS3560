public class Account {

    private double balance;

    public Account() {
        this.balance = 0.0;
    }

}

public class CheckingAccount extends Account {
    @Override
    public void chargeTransaction() {
        balance -= 2.0; 
    }
}

public class SavingsAccount extends Account {
    @Override
    public void chargeTransaction() {
        balance -= 1.0; 
    }
}
