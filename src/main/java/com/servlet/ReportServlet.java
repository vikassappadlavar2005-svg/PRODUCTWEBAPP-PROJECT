package com.servlet;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.dao.ProductDAO;
import com.model.Product;
@WebServlet("/ReportServlet")
public class ReportServlet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
try {
double price = Double.parseDouble(req.getParameter("price"));
ProductDAO dao = new ProductDAO();
List<Product> list = dao.getByPrice(price);
req.setAttribute("list", list);
req.getRequestDispatcher("report_result.jsp").forward(req, res);
} catch (Exception e) {
e.printStackTrace();
}
}
}