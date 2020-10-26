package Exercise1;

public class Bank {
    private double balance;
    private double rate;
    public Bank(double balance,double rate){
        this.balance=balance;
        this.rate=rate;
    }

    public double claculateInterest(){
        double annualInterestRate ;
        annualInterestRate=rate*10;
        return balance*(annualInterestRate/1200);
    }
}
