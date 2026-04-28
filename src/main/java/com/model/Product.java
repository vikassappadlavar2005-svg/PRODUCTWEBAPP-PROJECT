package com.model;
public class Product {
private int productID;
private String productName, category;
private double price;
private int quantity;
public int getProductID() { return productID; }
public void setProductID(int id) { this.productID = id; }
public String getProductName() { return productName; }
public void setProductName(String name) { this.productName = name; }
public String getCategory() { return category; }
public void setCategory(String c) { this.category = c; }
public double getPrice() { return price; }
public void setPrice(double p) { this.price = p; }
public int getQuantity() { return quantity; }
public void setQuantity(int q) { this.quantity = q; }
}