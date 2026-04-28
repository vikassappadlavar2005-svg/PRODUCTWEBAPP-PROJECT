<html>
<body style="text-align:center;">
<h2>Generate Reports</h2>
<h3>By Price Greater Than</h3>
<form action="ReportServlet" method="get">
Price: <input type="number" step="0.01" name="price" required>
<input type="submit" value="Get Report">
</form><br><br>
<h3>By Category</h3>
<form action="ReportCriteriaServlet" method="get">
Category: <input type="text" name="category" required>
<input type="submit" value="Get Report">
</form>
</body>
</html>