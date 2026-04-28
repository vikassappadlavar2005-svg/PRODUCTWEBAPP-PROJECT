package com.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.dao.ProductDAO;
import com.model.Product;
@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
try {
Product p = new Product();
p.setProductID(Integer.parseInt(req.getParameter("id")));
p.setProductName(req.getParameter("name"));
p.setCategory(req.getParameter("category"));
p.setPrice(Double.parseDouble(req.getParameter("price")));
p.setQuantity(Integer.parseInt(req.getParameter("quantity")));
ProductDAO dao = new ProductDAO();
dao.updateProduct(p);
res.sendRedirect("index.jsp");
} catch (Exception e) {
e.printStackTrace();
}
}
}