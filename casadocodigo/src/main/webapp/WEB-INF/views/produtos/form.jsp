<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html > <!-- (28) deixe o arquivo no formato html5 nesta linha e tag meta charet=UTF-8 -->
<html>
<head>
<meta charset="UTF-8"><!--(29) altere o titulo   -->
<title>Livros - Casa do C�digo</title>
</head>
<body>
	
	<!-- (30) crie um formulario para o titulo e descri�o com uma div e uma label e input para o titulo,
	 e outra para a descri��o com um text aria de 10 linha e 20 colunas	 -->
	<form action="/casadocodigo/produtos" method="post"><!-- (33) para onde enviar os dados ao clicar em submit,
	utilizando o method post envia para o controller "/produtos" -->
	<!-- (34)vamos criar o controller ProdutosController no packge controllers -->
		<div>
			<label>Titulo</label>
			<input type="text" name = "titulo"><!-- input do tipo texto e name que ser� enviado para o controller -->	
		</div>
		<div>
			<label>Descri��o</label>
			<textarea rows="10" cols="20" name="descricao"></textarea><!-- name envia os dados para o servidor o "controller" -->
		</div>
		<div><!-- (31) crie mais um div,label, input text name=paginas -->
			<label>P�ginas</label>
			<input type="text" name="paginas">
		</div>
		<!-- (32) crie um button type="submit" para enviar os dados para o controller -->
		<button type="submit">Cadastrar</button>
		
	</form>
	
</body>
</html>