package org.example.wartoscreferencja;

public class Main {

    public static void main(String[] args) {



        Reference reference = new Reference();
        Car car = new Car("BMW","X6",2022,"BLACK");
        reference.showCarDetails(car);


        Wallet wallet = new Wallet();
        for(int i = 1; i<=6; i++)
        {
            wallet.addMoney(5000);
            wallet.removeMoney(2000);
            wallet.removeMoney(1000);

        }
        wallet.printMoney();

    }
}
