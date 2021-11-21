<%@ page import="java.until.List" %>
<%@ page import="ru.gb.entiti.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
<tiltle>Product</title>
</head>
<body>
<h2>Product</h2>
<p>Name: ${product.id}</p>
<p>Age: ${product.title}</p>
<p>Cost</p>
<hr>
<ul>
<% for (Product value: (List<Product>) ((Product)request.getAttribute("product")).getCost()) { %>
  <li>id: <%=value.getId()%>; title: <%=value.getTitle()%></li>
<% } %>

</ul>
<hr>
</body>
</html>