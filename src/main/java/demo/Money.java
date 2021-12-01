package demo;

public class Money {
    private int amount;
    private String currency;

    public Money(int amount, String currency){
        this.amount=amount;
        this.currency=currency;
    }

    public String toString(){
        return "somme="+amount+currency;
    }
}
