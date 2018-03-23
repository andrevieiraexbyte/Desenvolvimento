<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html > 
<html>
<head>
<meta charset="UTF-8">
<title>Livros - Casa do Código</title>
</head>
<body>
	
	<!-- (109) crie um H1, vá para produtosController -->
	<h1>Lista de Produtos</h1>
	
	<!-- (106) copiando e colando o arquivo form deixe somente o body em branco -->
	<!-- (107) crie uma tabela com linhas e colunas -->
	<table>
		<tr>
			<td>Título</td>
			<td>Descrição</td>
			<td>Páginas</td>
		</tr>
	<!-- (108) crie uma tabela com foreach percorrento produtos  -->
		<c:forEach items="${produtos }" var="produto">
			<tr>
				<td>${produto.titulo }</td>
				<td>${produto.descricao }</td>
				<td>${produto.paginas }</td>
			</tr>	
		</c:forEach>	
		
	</table>
		
</body>
</html>