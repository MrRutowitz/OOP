package org.example.static_example;

public class Item {

    static int numItems = 0;
    int id;

    public Item(int id) {
        this.id = id;
    }

    public static int getNextId(){
        return numItems++;
    }

    public static Item getItem(){
        int id = Item.getNextId();
        Item  item = new Item(id);
        return item;
    }

    public static void printNumItems(){
        System.out.println("Num items: "+Item.numItems);
    }

    public void printId() {
        System.out.println("Item ID: "+ this.id);
    }
}
