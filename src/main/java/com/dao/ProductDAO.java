package com.dao;
import java.sql.*;
import java.util.*;
import com.model.Product;
public class ProductDAO {
Connection con;
public ProductDAO() throws Exception {
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "Manju@2005");
}
public void addProduct(Product p) throws Exception {
PreparedStatement ps = con.prepareStatement("INSERT INTO Products (ProductName, Category, Price, Quantity) VALUES(?,?,?,?)");
ps.setString(1, p.getProductName());
ps.setString(2, p.getCategory());
ps.setDouble(3, p.getPrice());
ps.setInt(4, p.getQuantity());
ps.executeUpdate();
}
public void updateProduct(Product p) throws Exception {
PreparedStatement ps = con.prepareStatement("UPDATE Products SET ProductName=?, Category=?, Price=?, Quantity=? WHERE ProductID=?");
ps.setString(1, p.getProductName());
ps.setString(2, p.getCategory());
ps.setDouble(3, p.getPrice());
ps.setInt(4, p.getQuantity());
ps.setInt(5, p.getProductID());
ps.executeUpdate();
}
public void deleteProduct(int id) throws Exception {
PreparedStatement ps = con.prepareStatement("DELETE FROM Products WHERE ProductID=?");
ps.setInt(1, id);
ps.executeUpdate();
}
public List<Product> getAllProducts() throws Exception {
List<Product> list = new ArrayList<>();
ResultSet rs = con.createStatement().executeQuery("SELECT * FROM Products");
while(rs.next()){
Product p = new Product();
p.setProductID(rs.getInt(1));
p.setProductName(rs.getString(2));
p.setCategory(rs.getString(3));
p.setPrice(rs.getDouble(4));
p.setQuantity(rs.getInt(5));
list.add(p);
}
return list;
}
public List<Product> getByPrice(double price) throws Exception {
List<Product> list = new ArrayList<>();
PreparedStatement ps = con.prepareStatement("SELECT * FROM Products WHERE Price > ?");
ps.setDouble(1, price);
ResultSet rs = ps.executeQuery();
while(rs.next()){
Product p = new Product();
p.setProductID(rs.getInt(1));
p.setProductName(rs.getString(2));
p.setCategory(rs.getString(3));
p.setPrice(rs.getDouble(4));
p.setQuantity(rs.getInt(5));
list.add(p);
}
return list;
}
public List<Product> getByCategory(String category) throws Exception {
List<Product> list = new ArrayList<>();
PreparedStatement ps = con.prepareStatement("SELECT * FROM Products WHERE Category=?");
ps.setString(1, category);
ResultSet rs = ps.executeQuery();
while(rs.next()){
Product p = new Product();
p.setProductID(rs.getInt(1));
p.setProductName(rs.getString(2));
p.setCategory(rs.getString(3));
p.setPrice(rs.getDouble(4));
p.setQuantity(rs.getInt(5));
list.add(p);
}
return list;
}
}