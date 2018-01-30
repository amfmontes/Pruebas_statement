<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Nuestros servicios</h2>
<br>
<p><c:out value="${minombre}"/></p>
<br>
<div style="border-color: black"></div>
<table class="table table-striped">
<tbody>
<tr><td>Inventariación vegetal</td></tr>
<tr><td>Realizaciones de EIA</td></tr>
<tr><td>Realización de proyectos</td></tr>
<tr><td>Visitas guiadas</td></tr>
<tr><td>Información de centros naturales</td></tr>

</tbody>



</table>

</body>
</html>