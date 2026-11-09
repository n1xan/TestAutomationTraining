package objectsExample;

import java.util.Random;

public class BankAccount {
    //Software objects model real-world objects or abstract concepts
    //Examples:
    //bank, account, customer, dog, bicycle, queue
    //Real-world objects have states and behaviors
    //Account' states:
    //holder, balance, type
    //Account' behaviors:
    //withdraw, deposit, suspend

    private Person holder;
    private int balanceAmount;
    private String balanceCurrency; // EUR, USD, GBP
    private String type; // savings, checking
    private String iban; // BG89

    public BankAccount (String type, String balanceCurrency, Person holder) {
        this.type = type;
        this.balanceCurrency = balanceCurrency;
        this.holder = holder;
        this.balanceAmount = 0;
        Random r = new Random();
        this.iban = "BG81UBBS" + Integer.toString(r.nextInt());
    }

    public String getBalance() {
        return balanceAmount + " " + balanceCurrency;
    }

    public String getCurrency() {
        return balanceCurrency;
    }

    public String getIban() {
        return iban;
    }

    public String getType() {
        return type;
    }

    public Person getHolder() {
        return holder;
    }

    public int withdraw(int withdrawAmount) {
        if (this.balanceAmount > 0) {
            if (this.balanceAmount < withdrawAmount) {
                throw new IllegalArgumentException("Withdraw amount is bigger than available funds.");
            }

            // IMPORTANT!!!!
            this.balanceAmount -= withdrawAmount;
            return this.balanceAmount;
        }
        else {
            throw new IllegalArgumentException("The account as 0 balance");
        }
    }

    public int deposit (int depositAmount) {
        if (depositAmount > 0) {
            this.balanceAmount += depositAmount;

            return this.balanceAmount;
        }
        else {
            throw new IllegalArgumentException("Cannot deposit negative amount");
        }
    }
}
