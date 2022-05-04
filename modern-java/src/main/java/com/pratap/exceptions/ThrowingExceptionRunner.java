package com.pratap.exceptions;

class Amount {

    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that){
        if (!this.currency.equals(that.currency))
            throw new CurrencyDoNotMatchException("Currency from "+this.currency+" to "+that.currency+" Not Matched");
        this.amount = this.amount + that.amount;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}

class CurrencyDoNotMatchException extends RuntimeException{

    public CurrencyDoNotMatchException(String message){
        super(message);
    }
}
public class ThrowingExceptionRunner {

    public static void main(String[] args) {
        Amount INR = new Amount("INR", 20);
        Amount USD = new Amount("USD", 30);

        USD.add(INR);
    }
}
