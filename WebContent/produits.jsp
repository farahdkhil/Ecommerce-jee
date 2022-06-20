<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste des produits</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="header.jsp" %>
<p></p>
<div class="container">
<div class="card">
  <div class="card-header">
    Voici La liste des Produits! Vous pouvez chercher!!
  </div>
  <div class="card-body">
      <form action="chercher.fa" method="get"class="row g-3">
      <div class="col-auto">
        <label>Tapez pour chercher >>></label>
        <input type="text" name="motCle" class="form-control" value="${model.motCle}"autofocus/>
        <br>
        <button type="submit" class="btn btn-outline-success">Chercher</button>
        </div>
      </form>
      <br/>     
      <table class="table table-striped">
        <tr>
          <th>ID</th><th>Nom Produit</th><th>Prix</th><th>Suppression<th>Modification</th><th>Image<th>
         </tr>
         <c:forEach items="${model.produits}" var="p">
           <tr>
              <td>${p.idProduit }</td>
              <td>${p.nomProduit }</td>
              <td>${p.prix }</td>
              <!-- <td><img src=<c:out value="${p.image}"></c:out> alt="image here" /></td>  --> 
              <td><a onclick="return confirm('Etes-vous sûr de supprimer ce produit?')" href="supprimer.fa?id=${p.idProduit }">Supprimer</a></td>
               <td><a href="update.fa?id=${p.idProduit }">Edit</a></td>
               <td><img src="images/images.jfif"/></td>
           </tr>
         </c:forEach>        
      </table>
  </div>
</div>
</div>
<nav aria-label="Page navigation example">
  <ul class="pagination justify-content-center">
    <li class="page-item disabled">
      <a class="page-link" href="#" tabindex="-1">Previous</a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#">Next</a>
    </li>
  </ul>
</nav>
</body>
<p></p>
<%@include file="footer.jsp" %>
</html>