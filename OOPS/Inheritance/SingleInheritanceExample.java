//base class
class Account {
    String accountHolderName;
    double balance;

    void deposite(double amount){
        balance += amount;
        System.out.println(balance);
    }
}

//derived class
class SavingAccount extends Account {
    double interestRate;

    void applyInterest(){
        double interest = balance * interestRate/100;

        balance += interest;
        System.out.println(balance);

    }
}



public class SingleInheritanceExample {
    public static void main(String[] args) {
        SavingAccount obj = new SavingAccount();
        obj.accountHolderName = "Kranti Mane";
        obj.balance = 2000.8;
        obj.interestRate = 5.0;
        obj.deposite(500.0);
        obj.applyInterest();
    }
}