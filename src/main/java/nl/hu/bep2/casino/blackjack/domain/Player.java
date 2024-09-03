package nl.hu.bep2.casino.blackjack.domain;

public class Player {
    private final String name;
    private final int balance;

    public Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
