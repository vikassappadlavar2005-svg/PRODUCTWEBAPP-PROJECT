package com.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.dao.ProductDAO;
import com.model.Product;
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
try {
Product p = new Product();
p.setProductName(req.getParameter("name"));
p.setCategory(req.getParameter("category"));
p.setPrice(Double.parseDouble(req.getParameter("price")));
p.setQuantity(Integer.parseInt(req.getParameter("quantity")));
ProductDAO dao = new ProductDAO();
dao.addProduct(p);
res.sendRedirect("DisplayProductsServlet");
} catch (Exception e) {
e.printStackTrace();
}
}
}