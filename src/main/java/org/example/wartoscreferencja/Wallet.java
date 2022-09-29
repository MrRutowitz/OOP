package org.example.wartoscreferencja;

public class Wallet {

    float money;


    public Wallet() {
        this.money = 3000;
    }


    public float addMoney(float amount){
        money= money+amount;
        return money;
    }

    public float removeMoney(float amount){
        money = money - amount;
        return money;
    }

    public void printMoney(){
        System.out.println(money);
    }
}
