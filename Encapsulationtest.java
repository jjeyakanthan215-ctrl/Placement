class BankAccount
{
    private double balance = 0;
    private String accountNumber;
    public void setBalance(double amount){
        balance += amount;
    }
}
public class Encapsulationtest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000);
        
        System.out.println(account.getBalance());
    }
}s
