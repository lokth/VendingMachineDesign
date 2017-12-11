package com.practicemy.vendingmachine;

import java.util.List;

public class VendingMachineImpl implements VendingMachine {

    private Inventory<Coin> cashInventory = new Inventory<Coin>();
    private Inventory<Item> itemInventory = new Inventory<Item>();
    private long totalSales;
    private Item currentItem;
    private long currentBalance;

    public VendingMachineImpl() {
        initialize();
    }

    private void initialize(){
//        for(Coin c : Coin.values()){
//
//        }
    }

    @Override
    public long selectItemAndGetPrice(Item item) {
        return 0;
    }

    @Override
    public void insertCoin(Coin coin) {

    }

    @Override
    public List<Coin> refund() {
        return null;
    }

    @Override
    public Bucket<Item, List<Coin>> collectItemAndChange() {
        return null;
    }

    @Override
    public void reset() {

    }
}
