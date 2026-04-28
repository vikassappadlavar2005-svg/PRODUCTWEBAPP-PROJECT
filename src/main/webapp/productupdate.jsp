<html>
<body style="text-align:center;">
<h2>Update Product</h2>
<form action="UpdateProductServlet" method="post">
ID: <input type="number" name="id" required><br><br>
Name: <input type="text" name="name" required><br><br>
Category: <input type="text" name="category" required><br><br>
Price: <input type="number" step="0.01" name="price" required><br><br>
Quantity: <input type="number" name="quantity" required><br><br>
<input type="submit" value="Update Product">
</form>
</body>
</html>