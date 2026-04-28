<%@ page import="java.util.*,com.model.Product"%>
<html>
<body style="text-align:center;">
<h2>Report Results</h2>
<table border="1" align="center">
<tr><th>ID</th><th>Name</th><th>Category</th><th>Price</th><th>Quantity</th></tr>
<%
List<Product> list = (List<Product>)request.getAttribute("list");
if(list != null && list.size() > 0){
for(Product p : list){
%>
<tr>
<td><%=p.getProductID()%></td>
<td><%=p.getProductName()%></td>
<td><%=p.getCategory()%></td>
<td><%=p.getPrice()%></td>
<td><%=p.getQuantity()%></td>
</tr>
<% } } else { %>
<tr><td colspan="5">No Data Found</td></tr>
<% } %>
</table><br><br>
<a href="index.jsp">Back to Home</a>
</body>
</html>