public class BankHierarchicalInheritance {
    public String accountName = "vinay";
    public int accountNumber = 12345;
    public double availableBalance = 2000.00;

    public void details() {
        System.out.println("Account holer name :" + accountName);
        System.out.println("Account Number :" + accountNumber);
    }

}

class Deposit extends BankHierarchicalInheritance {
    public double amt = 6000.00;

    public void deposit() {
        availableBalance = availableBalance + amt;
        System.out.println("available balance after deposit :" + availableBalance);
    }
}

class Withdrawl extends BankHierarchicalInheritance {
    public double wtamt = 3000.00;

    public void wtamt() {
        availableBalance = availableBalance - wtamt;
        System.out.println("Available balance after withdrawl" + availableBalance);
    }
}

class Mainclass {
    public static void main(String[] args) {
        Deposit d = new Deposit();
        d.details();
        d.deposit();
        Withdrawl w = new Withdrawl();
        w.details();
        w.wtamt();
    }
}
