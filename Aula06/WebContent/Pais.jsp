<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.Pais" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Pais</title>
		
		<link href="css/bootstrap.min.css" rel="stylesheet">
	    <link href="css/style.css" rel="stylesheet">
	</head>
	<body>
		<%Pais pais= (Pais) request.getAttribute("pais"); %>
	        <!-- Barra superior com os menus de navegação -->
	
	        <!-- Container Principal -->
	        <div id="main" class="container">
	            <h3 class="page-header">ID do Pais #<%=pais.getId() %></h3>
	            <div class="row">
	                <div class="col-md-12">
	                    <p><strong>Pais</strong>
	                    </p>
	                    <p>
	                        <%=pais.getNome() %>
	                    </p>
	                </div>
	            </div>
	            <div class="row">
	                <div class="col-md-6">
	                    <p><strong>População</strong>
	                    </p>
	                    <p>
	                        <%=pais.getPopulacao() %>
	                    </p>
	                </div>
	                <div class="col-md-6">
	                    <p><strong>Area em M²</strong>
	                    </p>
	                    <p>
	                        <%=pais.getArea() %>
	                    </p>
	                </div>
	            </div>
	            <hr />
	            <div id="actions" class="row">
	                <div class="col-md-12">
	                    <a href="PaisIndex.html" class="btn btn-default">Voltar</a>
	                </div>
	            </div>
	        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
	</body>
</html>