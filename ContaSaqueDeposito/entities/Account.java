package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;


    public void Deposit(double balance){
        this.balance += balance + this.balance;
    }

    public void Withdraw(double Withdraw){
        if(Withdraw > withDrawLimit){
            throw new IllegalArgumentException("Saque maior que o permitido");
        }
        if(Withdraw > this.balance){
            throw new IllegalArgumentException("Saque maior que o saldo inicial");
        }
        this.balance = this.balance - Withdraw;
    }

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return this.balance;
    }

    public Double getWithDrawLimit() {
        return this.withDrawLimit;
    }

    public void setWithDrawLimit(Double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }

}
