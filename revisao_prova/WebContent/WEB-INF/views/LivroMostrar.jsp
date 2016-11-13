<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html lang="pt-br">
<head>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Livros</title>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">

</head>
<body>
	<c:import url="menu.jsp"></c:import>
	<div class="container-fluid">
		<div class="panel-primary">
			<div class="panel-heading">Livro Inserido</div>
			<div class="panel-boy">
				<div class="form-group">
					
						<p>ID:${livro.id}</p>
						<p>Nome:${livro.nome}</p>
						<p>Gênero:${livro.genero}</p>
						<p>ISBN:${livro.isbn}</p>

					
				</div>
			</div>
		</div>
	</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$("#delete-modal").on('show.bs.modal', function(event) {
			var button = $(event.relatedTarget); //botao que disparou a modal
			var recipient = button.data('livro');
			$("#id_excluir").val(recipient);
		});
	</script>
</body>
</html>