package com.company.Lab3.AnimalRescue;


public class Food {
    //atributele clasei
    private String nameFood;
    private float price;
    private int quantity;
    private String inStock;

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }
    public String getNameFood() {
        return nameFood;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setQuantity(int quatity) {
        this.quantity = quatity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    public String getInStock() {
        return inStock;
    }
}
