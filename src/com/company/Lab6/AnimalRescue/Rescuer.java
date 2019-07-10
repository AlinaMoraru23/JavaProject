package com.company.Lab6.AnimalRescue;

 class Rescuer extends Human {

    //atributele clasei


    private int money;


    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void intention() {
        System.out.println("Adopt animal");
     }
}
