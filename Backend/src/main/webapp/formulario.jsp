<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.ipartek.formacion.modelos.Producto, java.util.List, java.util.*" %>
<%
Object o = request.getAttribute("productos");

List<Producto> productos = (List<Producto>)o;

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles.css">
<script src="https://kit.fontawesome.com/e9c1e0909b.js" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

<title>Formulario</title>
</head>
<body>

<h3 class="text-primary-emphasis text-center mt-5">Formulario</h3>
<div class="d-flex justify-content-center ">
<form action="formulario" method="post" class="form w-25 m-4">
<div class="mb-3">
  <label for="nameInput" class="form-label">Nombre</label>
  <input type="text" class="form-control" id="nameInput" name="nombre" placeholder="Nombre del producto">
</div>
<div class="mb-3">
  <label for="precioInput" class="form-label">Precio</label>
  <input type="number" step=".01" class="form-control" id="precioInput" name="precio" placeholder="Precio del producto">
</div>
<div class="mb-3">
  <label for="DateInput" class="form-label">Fecha Caducidad</label>
  <input type="date" class="form-control" id="DateInput" name="caducidad">
</div>
<div class="d-flex justify-content-center">
	<button class= "btn btn-primary">Agregar Producto</button>
</div>
</form>
</div>
</body>
</html>