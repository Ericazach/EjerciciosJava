<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.ipartek.formacion.modelos.Producto, java.util.List" %>
<%
Object o = request.getAttribute("productos");

System.out.println(o);

List<Producto> productos = (List<Producto>)o;
%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Listado</title>
</head>
<body>
<h1 class="text-center">Productos</h1>
<div class="d-flex flex-col justify-content-center">


<table class="table w-50 m-3">
	<thead>
		<tr class="table-secondary">
			<th class="col">Id</th>
			<th class="col">Nombre</th>
			<th class="col">Precio</th>
			<th class="col">Caducidad</th>
		</tr>
	</thead>
	<tbody>
		<% for(Producto producto: productos) { %>
		<tr class="table-light text-sm-start">
			<th><%= producto.getId() %></th>
			<td><%= producto.getNombre() %></td>
			<td><%= producto.getPrecio() %></td>
			<td><%= producto.getCaducidad() %></td>
		</tr>
		<% } %>
	</tbody>
</table>
</div>

</body>
</html>