<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html lang="pt-br">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">

<title>Inserir Livro</title>

<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">

</head>
<body>
	<c:import url="menu.jsp"></c:import>

	<div id="main" class="container-fluid">
		<div class="panel-primary">
			<div class="panel-heading">Insira um livro</div>
			<form class="form-group" action="incluir_livro" method="POST">
				<div class="panel-body">
					<div class="form-group">
						<label for="id">ID:</label> <input type="number"
							class="form-control" name="id" id="id" required placeholder="id">
					</div>
					<div class="form-group">
						<label for="nome">Nome:</label> <input type="text"
							class="form-control" name="nome" id="nome" required
							placeholder="Alice no País das Mavilhas">
					</div>
					<div class="form-group">
						<label for="genero">Gênero:</label> <input type="text"
							class="form-control" name="genero" id="genero" required
							placeholder="Aventura">
					</div>
					<div class="form-group">
						<label for="isbn">ISBN:</label> <input type="number"
							class="form-control" name="isbn" id="isbn" required
							placeholder="145875266974-9">
					</div>
					<button type="submit" class="btn btn-primary">Cadastrar</button>
					<a href="LivroListar" class="btn btn-default">Cancelar</a>

				</div>
			</form>
		</div>
	</div>




	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>