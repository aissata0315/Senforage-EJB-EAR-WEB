<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Village</title>
</head>
<body>
		<!-- <c:if test="${village != null }">
			<c:forEach items="${villages }" var="village">
				<pre>${village.nom}</pre>
			</c:forEach>>
			
		</c:if>
		<a href ="Village">Liste</a> !-->
		
	<h2>Formulaire d'enregistrement d'un village</h2>
	<form method = "post" action = "Village">
  	<div class="form-group">
   		 <label for="">Village</label>
    	 <input type="text" class="form-control" placeholder = "Nom du village..." name="nomVillage" >
  	</div>
  		<button type="submit" class="btn btn-primary">Enregistrer</button>
	</form>

</body>
</html>