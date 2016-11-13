<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html lang="pt-br">
<head>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Livro Listar</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">

</head>
<body>
	<!-- Modal -->
	<div class="modal fade" id="delete-modal" tabindex="-1" role="dialog"
		aria-labelledby="modalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Fechar">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="modalLabel">Excluir Livro</h4>
				</div>
				<div class="modal-body">Deseja realmente excluir este Livro?</div>
				<div class="modal-footer">
					<form action="excluir_livro" method="post">
						<input type="hidden" name="id" id="id_excluir" />
						<button type="submit" class="btn btn-primary">Sim</button>
						<button type="button" class="btn btn-default" data-dismiss="modal">N&atilde;o</button>
					</form>
				</div>
			</div>
		</div>
		
	</div>
	<!-- /.modal -->
	<c:import url="menu.jsp"></c:import>
	<div class="container">
		<form action="listar_livro" method="post">
			<div id="top" class="row">
				<div class="col-md-3">
					<h2>Locais</h2>
				</div>

				<div class="col-md-6">
					<div class="input-group h2">
						<input name="lchave" class="form-control" id="search" type="text"
							placeholder="Pesquisar Locais (deixe vazio para trazer todos)">
						<span class="input-group-btn">
							<button class="btn btn-primary" type="submit">
								<span class="glyphicon glyphicon-search"></span>
							</button>
						</span>
					</div>
				</div>

				<div class="col-md-3">
					<a href="livro" class="btn btn-primary pull-right h2">Novo
						Livro</a>
				</div>
			</div>
			<!-- /#top -->
		</form>
		<c:if test="${not empty livro}">
			<div id="list" class="row">

				<div class="table-responsive col-md-12">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>ID</th>
								<th>Nome</th>
								<th>Gênero</th>
								<th>ISBN</th>
								<th class="actions">A&ccedil;&otilde;es</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="livro" items="${livro}">
								<tr>
									<td>${livro.id }</td>
									<td>${livro.nome }</td>
									<td>${livro.genero }</td>
									<td>${livro.isbn }</td>
									<td class="actions"><a class="btn btn-success btn-xs"
										href="mostrar_livro?id=${livro.id }">Exibir</a> <a
										class="btn btn-warning btn-xs"
										href="alterar_livro?id=${livro.id }">Alterar</a>
										<button id="btn${livro.id }%>" type="button"
											class="btn btn-danger btn-xs" data-toggle="modal"
											data-target="#delete-modal" data-local="${livro.id }">Excluir</button>
									</td>
								</tr>
							</c:forEach>

						</tbody>
					</table>

				</div>
			</div>
			<!-- /#list -->

		</c:if>
		<!-- /#bottom -->
		
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