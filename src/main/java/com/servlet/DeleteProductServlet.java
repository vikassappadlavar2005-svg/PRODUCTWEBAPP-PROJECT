package com.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.dao.ProductDAO;
@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
try {
int id = Integer.parseInt(req.getParameter("id"));
ProductDAO dao = new ProductDAO();
dao.deleteProduct(id);
res.sendRedirect("index.jsp");
} catch (Exception e) {
e.printStackTrace();
}
}
}