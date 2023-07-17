<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.ipartek.formacion.modelos.Producto, java.util.List" %>
<%
Object o = request.getAttribute("productos");

List<Producto> productos = (List<Producto>)o;

System.out.println(productos);
%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<script src="https://kit.fontawesome.com/e9c1e0909b.js" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Listado</title>
</head>
<body>

<h1 class="text-primary-emphasis text-center mt-5">Productos</h1>


<div class="d-flex justify-content-center">

<table class="table w-50 m-3">
	<thead>
		<tr class="table-secondary  text-sm-center rounded ">
			<th class="col text-primary">Id</th>
			<th class="col text-primary">Nombre</th>
			<th class="col text-primary">Precio</th>
			<th class="col text-primary">Caducidad</th>
			<th class="col text-primary">Opciones</th>
		</tr>
	</thead>
	<tbody>
		<% for(Producto producto: productos) { %>
		<tr class="table-light text-sm-center">
			<th><%= producto.getId() %></th>
			<td><%= producto.getNombre() %></td>
			<td><%= producto.getPrecio() %></td>
			<td><%= producto.getCaducidad() %></td>
			<td><button class="btn btn-primary"><i class="fa-regular fa-pen-to-square"></i></button>
			<button class="btn btn-danger"><i class="fa-solid fa-trash-can"></i></button></td>
		</tr>
		<% } %>
	</tbody>
</table>
</div>

<div class="d-flex justify-content-center">
<a href="formulario.jsp" class="btn btn-primary text-center">Agregar producto </a>
</div>



</body>
</html>