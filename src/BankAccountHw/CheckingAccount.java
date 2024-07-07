/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccountHw;

/**
 *
 * @author user
 */
public class CheckingAccount extends BankAccount{
    double transectionLimit;

    public CheckingAccount(String accNo, double balance, double transectionLimit) {
        super(accNo, balance);
        this.transectionLimit = transectionLimit;
    }

    public void deductTransectionFee(double amount) {
        double fee = amount * 0.02;
        if (amount > transectionLimit){
            setBalance(getBalance() - fee-amount);
            System.out.println("Transection fee: " + fee + " Taka");
            System.out.println("after deductTransactionfee withdraw: " + amount + " Taka");
        }
    }

    public String toString() {
        return super.toString() + "\nTransection Limit: " + transectionLimit + "\n";
    }

    public void deposit(double amount) {
        super.deposit(amount);
        deductTransectionFee(amount);
    }
}
