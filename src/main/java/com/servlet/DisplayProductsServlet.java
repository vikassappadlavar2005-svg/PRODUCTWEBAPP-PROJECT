package com.servlet;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.dao.ProductDAO;
import com.model.Product;
@WebServlet("/DisplayProductsServlet")
public class DisplayProductsServlet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
try {
ProductDAO dao = new ProductDAO();
List<Product> list = dao.getAllProducts();
req.setAttribute("list", list);
req.getRequestDispatcher("productdisplay.jsp").forward(req, res);
} catch (Exception e) {
e.printStackTrace();
}
}
}