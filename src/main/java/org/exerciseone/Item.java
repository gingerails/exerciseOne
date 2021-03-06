package org.exerciseone;

import java.util.Comparator;

/**
 *  Item Object class.
 *  Item has an ID, description, brand, and price.
 */
public class Item implements Comparator<Item> {
    private String itemId;
    private String itemDescription;
    private String itemBrand;
    private double itemPrice;// I read online that floats/doubles shouldn't be used for currency. I will look into BigDecimal.

    /**
     * Default constructor, sets data to unknown, 0 values
     */
    public Item() {
        itemId ="unknown";
        itemDescription ="unknown";
        itemBrand = "unknown";
        itemPrice = 0.0;
    }

    /**
     * Basic Getters and Setters generated by IntelliJ
     */
    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemDescription() {
        return itemDescription;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemBrand() {
        return itemBrand;
    }
    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String returnAllInfo(){
        String allInfo = this.getItemId() + " " + this.getItemBrand() + " " + this.getItemDescription() + " " + this.getItemPrice();
        return allInfo;
    }

    /**
     * Parameterized constructor. 'This' keyword refers to current instance itself.
     * @param itemId
     * @param itemBrand  String itemId, String itemBrand, double itemPrice
     * @param itemPrice
     */
    public Item(String itemId, String itemBrand, String itemDescription, double itemPrice) {        // Too many parameters; would varargs help?
        this.itemId = itemId;
        this.itemDescription = itemDescription;
        this.itemBrand = itemBrand;
        this.itemPrice = itemPrice;
    }

    @Override
    public int compare(Item o1, Item o2) {
        return 0;
    }
}
