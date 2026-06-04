class BankAccount{
    private double balance = 0;
    public void setBalance(double amount){
        balance += amount;
    }
    public double getBalance(){
        return balance;

    }

}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000);
        
        System.out.println(account.getBalance());
    }
}