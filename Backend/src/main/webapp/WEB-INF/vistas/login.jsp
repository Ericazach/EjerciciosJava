<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/vistas/includes/cabecera.jsp"%>

<div class="d-flex flex-column justify-content-center ">
<form action="login" method="post" class="max-w-25">

	<div class="row mb-3">
		<label for="email" class="col-sm-2 col-form-label">Email</label>
		<div class="col-sm-10">
			<input type="email" class="form-control" id="email" name="email">
		</div>
	</div>
	<div class="row mb-3">
		<label for="password" class="col-sm-2 col-form-label">Contraseña</label>
		<div class="col-sm-10">
			<input type="password" class="form-control" id="password" name="password">
		</div>
	</div>
	<button type="submit" class="btn btn-primary">Login</button>

</form>
</div>

<%@ include file="/WEB-INF/vistas/includes/pie.jsp"%>